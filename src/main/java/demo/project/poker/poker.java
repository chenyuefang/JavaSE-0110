package demo.project.poker;

import com.mysql.jdbc.Driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.List;

/**
 * Spade > Heart > Club > Diamond
 */
public class poker {
    public static class PokerDemo extends JFrame implements ActionListener {

        private static final String PATH = "assets/images/";
        private static final int CARD_WIDTH = 69 * 2;
        private static final int CARD_HEIGHT = 106 * 2;
        private static final String[] CARDS = {
                "3S", "3H", "3C", "3D",
                "4S", "4H", "4C", "4D",
                "5S", "5H", "5C", "5D",
                "6S", "6H", "6C", "6D",
                "7S", "7H", "7C", "7D",
                "8S", "8H", "8C", "8D",
                "9S", "9H", "9C", "9D",
                "10S", "10H", "10C", "10D",
                "JS", "JH", "JC", "JD",
                "QS", "QH", "QC", "QD",
                "KS", "KH", "KC", "KD",
                "2S", "2H", "2C", "2D",
                "AS", "AH", "AC", "AD",
        };

        private JPanel main, north, center, south;
        private JButton start, exit, computerWin, playerWin;
        private ImageButton computer, player, red, green, blue, gray, purple, yellow;
        private Map<ImageButton, String> stack;

        private PokerDemo() {
            initComponent();
        }

        private void initComponent() {
            setTitle("Poker Demo");
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(d);
            setUndecorated(true);

            main = new ImagePanel(PATH + "poker_bg.jpg");
            main.setLayout(new BorderLayout());

            north = new JPanel();
            north.setPreferredSize(new Dimension(d.width, CARD_HEIGHT + 40));
            north.setOpaque(false);
            main.add(north, BorderLayout.NORTH);

            initCenter();

            south = new JPanel();
            south.setPreferredSize(new Dimension(d.width, CARD_HEIGHT + 40));
            south.setOpaque(false);
            main.add(south, BorderLayout.SOUTH);

            computerWin = new ImageButton(PATH + "win.png", 200, 200);
            north.add(computerWin, BorderLayout.NORTH);
            playerWin = new ImageButton(PATH + "win.png", 200, 200);
            south.add(playerWin, BorderLayout.SOUTH);

            computerWin.setVisible(false);
            playerWin.setVisible(false);

            add(main);
            setVisible(true);
        }

        private void initCenter() {

            playerSelected = null;

            if (computer != null) {
                north.remove(computer);
                if (computerWin != null) {
                    computerWin.setVisible(false);
                }
            }

            if (player != null) {
                south.remove(player);
                if (playerWin != null) {
                    playerWin.setVisible(false);
                }
            }

            center = new ImagePanel(PATH + "center_bg.jpg");
            center.setLayout(new GridBagLayout());

            start = new ImageButton(PATH + "start.png", 128, 128);
            exit = new ImageButton(PATH + "exit.png", 128, 128);
            start.addActionListener(this);
            exit.addActionListener(this);

            center.add(start);

            red = new ImageButton(PATH + "cards/red_back.png", CARD_WIDTH, CARD_HEIGHT);
            green = new ImageButton(PATH + "cards/green_back.png", CARD_WIDTH, CARD_HEIGHT);
            blue = new ImageButton(PATH + "cards/blue_back.png", CARD_WIDTH, CARD_HEIGHT);
            gray = new ImageButton(PATH + "cards/gray_back.png", CARD_WIDTH, CARD_HEIGHT);
            purple = new ImageButton(PATH + "cards/purple_back.png", CARD_WIDTH, CARD_HEIGHT);
            yellow = new ImageButton(PATH + "cards/yellow_back.png", CARD_WIDTH, CARD_HEIGHT);

            Set<ImageButton> buttons = new HashSet<>();
            buttons.add(red);
            buttons.add(green);
            buttons.add(blue);
            buttons.add(gray);
            buttons.add(purple);
            buttons.add(yellow);

            stack = new LinkedHashMap<>();
            String[] tempCards = CARDS.clone();
            List<String> list = Arrays.asList(tempCards);
            Collections.shuffle(list); // shuffle the list
            int i = 0;
            for (ImageButton button : buttons) {
                stack.put(button, list.get(i));
                i++;
                center.add(button, new GridBagConstraints());
                button.addActionListener(this);
            }
            for (JButton button : stack.keySet()) {
                System.out.print("\t" + stack.get(button));
            }
            System.out.println();

            center.add(exit);

            main.add(center);
        }

        private String playerSelected = null;
        private String computerSelected = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            ImageButton selected = (ImageButton) e.getSource();
            if (selected == start) {
                main.remove(center);
                initCenter();
                main.revalidate();
                main.repaint();
            } else if (selected == exit) {
                System.exit(0);
            } else if (selected == player) {
                // 玩家摊牌
                south.remove(player);
                player = new ImageButton(PATH + "cards/" + playerSelected + ".png", CARD_WIDTH, CARD_HEIGHT);
                south.add(player);
                south.revalidate();
                south.repaint();

                // 计算机摊牌
                north.remove(computer);
                computer = new ImageButton(PATH + "cards/" + computerSelected + ".png", CARD_WIDTH, CARD_HEIGHT);
                north.add(computer);
                north.revalidate();
                north.repaint();

                String winner = null;
                for (String card : CARDS) {
                    if (playerSelected.equals(card)) {
                        computerWin.setVisible(true);
                        winner = "computer";
                        break;
                    }
                    if (computerSelected.equals(card)) {
                        playerWin.setVisible(true);
                        winner = "player";
                        break;
                    }
                }

                // TODO: 1/19/2019 save data to database
                try {
                    new Driver();
                    Connection connection = DriverManager.getConnection("jdbc:mysql:///?user=root&password=system");
                    String sql = "insert into db_poker.stat value (null, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, computerSelected);
                    preparedStatement.setString(2, playerSelected);
                    preparedStatement.setString(3, winner);
                    preparedStatement.executeUpdate();

                    preparedStatement.close();
                    connection.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } else {
                if (playerSelected == null) {
                    // 玩家
                    playerSelected = stack.get(selected);
                    System.out.println("player selected: " + playerSelected);
                    player = new ImageButton(selected.getImagePath(), CARD_WIDTH, CARD_HEIGHT);
                    player.addActionListener(this);
                    south.add(player, BorderLayout.SOUTH);
                    south.revalidate();
                    south.repaint();

                    // 计算机
                    stack.remove(selected);
                    @SuppressWarnings("SimplifyStreamApiCallChains")
                    ImageButton[] imageButtons = stack.keySet().stream().toArray(ImageButton[]::new);
                    ImageButton randomImageButton = imageButtons[new Random().nextInt(imageButtons.length)];
                    computerSelected = stack.get(randomImageButton);
                    System.out.println("computer selected: " + computerSelected);
                    computer = new ImageButton(randomImageButton.getImagePath(), CARD_WIDTH, CARD_HEIGHT);
                    north.add(computer, BorderLayout.NORTH);
                    north.revalidate();
                    north.repaint();
                }
            }
        }

        public static void main(String[] args) {
            new PokerDemo();
        }
    }
}
