package demo.project.poker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;

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

        private JPanel main, center;
        private JButton start, exit;
        private JButton computer, player, red, green, blue, gray, purple, yellow;
        private Map<JButton, String> stack;

        private PokerDemo() throws IOException {
            initComponent();
        }

        private void initComponent() throws IOException {
            setTitle("Poker Demo");
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(d);
            setUndecorated(true);

            main = new JPanelWithBackgroundImage(PATH + "porker_bg.jpg");
            main.setLayout(new BorderLayout());

            computer = new ImageButton(PATH + "cards/purple_back.png", CARD_WIDTH, CARD_HEIGHT);
            player = new ImageButton(PATH + "cards/purple_back.png", CARD_WIDTH, CARD_HEIGHT);

            // 计算机
            main.add(computer, BorderLayout.NORTH);

            // 初始化底牌
            initCenter();

            // 玩家
            main.add(player, BorderLayout.SOUTH);

            add(main);

            setVisible(true);
        }

        private void initCenter() throws IOException {

            center = new JPanelWithBackgroundImage(PATH + "center_bg.jpg");
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

            Set<JButton> buttons = new HashSet<>();
            buttons.add(red);
            buttons.add(green);
            buttons.add(blue);
            buttons.add(gray);
            buttons.add(purple);
            buttons.add(yellow);

            stack = new LinkedHashMap<>();
            for (JButton button : buttons) {
                int index = new Random().nextInt(CARDS.length);
                stack.put(button, CARDS[index]);
                center.add(button, new GridBagConstraints());
                button.addActionListener(this);
            }
            for (JButton key : stack.keySet()) {
                System.out.print(stack.get(key) + "\t");
            }
            System.out.println();

            center.add(exit);

            main.add(center);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton selected = (JButton) e.getSource();
            System.out.println(stack.get(selected));

            if (selected == start) {
                main.remove(center);
                try {
                    initCenter();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                main.revalidate();
                main.repaint();
            }

            if (selected == exit) {
                System.exit(0);
            }
        }

        public static void main(String[] args) throws Exception {
            new PokerDemo();
        }
    }
}
