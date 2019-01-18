package demo.day08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("button");

        jFrame.setSize(300, 300);

        JButton jButton = new JButton("button...");

        jButton.addActionListener(new ActionListener() { // 匿名内部类
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jFrame.add(jButton);

        jFrame.setVisible(true);
    }
}
