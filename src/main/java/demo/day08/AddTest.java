package demo.day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class AddTest implements ActionListener {

    private JTextField textA, textB;
    private JLabel labelSum;
    private JButton jButton;

    private AddTest() { // 构造方法：视图
        JFrame jFrame = new JFrame("button");
        jFrame.setSize(300, 600);
        jFrame.setLayout(null);

        textA = new JTextField();
        textA.setBounds(50, 50, 180, 50);
        textB = new JTextField();
        textB.setBounds(50, 120, 180, 50);
        labelSum = new JLabel();
        labelSum.setBounds(50, 190, 180, 50);
//        labelSum.setBackground(Color.darkGray);

        jButton = new JButton("SUM");
        jButton.setBounds(50, 260, 180, 50);
        jButton.addActionListener(this);

        jFrame.add(textA);
        jFrame.add(textB);
        jFrame.add(labelSum);
        jFrame.add(jButton);

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // 业务逻辑
        if (e.getSource() == jButton) {
            int a = Integer.parseInt(textA.getText());
            int b = Integer.parseInt(textB.getText());
            int sum = a + b;
            labelSum.setText(String.valueOf(sum));
//            labelSum.setText(sum + "");
        }
    }

    public static void main(String[] args) { // ...
        new AddTest();
    }
}
