package demo.project.poker;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class poker {
    public static class PokerDemo extends JFrame implements ActionListener {

        private static final int CARD_WIDTH = 69 * 2;
        private static final int CARD_HEIGHT = 106 * 2;
        private JPanel main, center;
        private JLabel _ah, _2c, _blue, _red, _purple;

        private PokerDemo() throws IOException {
            initComponent();
        }

        private void initComponent() throws IOException {
            setTitle("Poker Demo");
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(d);
            setUndecorated(true);
            getContentPane().setBackground(Color.darkGray);

            main = new JPanelWithBackgroundImage("assets/images/porker_bg.jpg");
            main.setLayout(new BorderLayout());

            _ah = new ImageLabel("assets/images/cards/AH.png", CARD_WIDTH, CARD_HEIGHT);
            _2c = new ImageLabel("assets/images/cards/2C.png", CARD_WIDTH, CARD_HEIGHT);


            center = new JPanelWithBackgroundImage("assets/images/center_bg.jpg");
            center.setLayout(new GridBagLayout());

            _red = new ImageLabel("assets/images/cards/red_back.png", CARD_WIDTH, CARD_HEIGHT);
            _blue = new ImageLabel("assets/images/cards/blue_back.png", CARD_WIDTH, CARD_HEIGHT);
            _purple = new ImageLabel("assets/images/cards/purple_back.png", CARD_WIDTH, CARD_HEIGHT);

            center.add(_red, new GridBagConstraints());
            center.add(_blue, new GridBagConstraints());
            center.add(_purple, new GridBagConstraints());


            EmptyBorder emptyBorder = new EmptyBorder(20, (int) d.getWidth() / 2 - 69, 20, 0);
            _ah.setBorder(emptyBorder);
            _2c.setBorder(emptyBorder);

            // 计算机

            main.add(_ah, BorderLayout.NORTH);

            // 底牌
            main.add(center, BorderLayout.CENTER);

            // 玩家
            main.add(_2c, BorderLayout.SOUTH);

            add(main);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        public static void main(String[] args) throws Exception {
            new PokerDemo();
        }
    }
}
