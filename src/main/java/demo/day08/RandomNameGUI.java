package demo.day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomNameGUI implements ActionListener {

    private JLabel nameLabel;
    private JButton nextButton;

    private RandomNameGUI() {
        initComponent();
    }

    private void initComponent() {
        JFrame frame = new JFrame("Random Name");
        frame.setSize(300, 300);
        frame.setLayout(null);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(0, 0, 300, 280);
        Font font = new Font("微软雅黑",Font.BOLD, 50);
        nameLabel.setFont(font);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nextButton = new JButton("NEXT");
        nextButton.setBounds(0, 200, 300, 20);
        nextButton.addActionListener(this);

        frame.add(nameLabel);
        frame.add(nextButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            nameLabel.setText(RandomName.getRandomName());
        }
    }

    public static void main(String[] args) {
        new RandomNameGUI();
    }
}
