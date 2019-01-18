package demo.day08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener {

    private JButton jButton;

    private ButtonTest() { // 构造方法：视图
        JFrame jFrame = new JFrame("button");

        jFrame.setSize(300, 300);

        jButton = new JButton("button...");

        jButton.addActionListener(this);

        jFrame.add(jButton);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // 业务逻辑
        if (e.getSource() == jButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) { // ...
        new ButtonTest();
    }
}
