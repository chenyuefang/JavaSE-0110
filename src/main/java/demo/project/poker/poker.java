package demo.project.poker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class poker {
    public static class PokerDemo extends JFrame implements ActionListener {

        private JPanel main;

        private PokerDemo() {
            initComponent();
        }

        private void initComponent() {
            setTitle("Poker Demo");
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(d);
            setUndecorated(true);
            getContentPane().setBackground(Color.darkGray);

            try {
                main = new JPanelWithBackgroundImage("assets/images/porker_bg.jpg");
            } catch (IOException e) {
                e.printStackTrace();
            }

            add(main);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        public static void main(String[] args) {
            new PokerDemo();
        }
    }
}
