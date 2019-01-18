package demo.day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDemo extends JFrame implements ActionListener {

    private JPanel main;
    private JButton loginButton;
    private CardLayout cardLayout;

    private StudentDemo() {
        initComponent();
    }

    private void initComponent() {
        setTitle("Student Demo");
        setSize(300, 300);

        cardLayout = new CardLayout();

        main = new JPanel(cardLayout);

        JPanel login = new JPanel();
        JPanel home = new JPanel();

        loginButton = new JButton("LOGIN");
        loginButton.addActionListener(this);
        login.add(loginButton);

        JLabel homeLabel = new JLabel("HOME");
        home.add(homeLabel);

        main.add(login, "login");
        main.add(home, "home");

        add(main);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

            cardLayout.show(main, "home");
        }
    }

    public static void main(String[] args) {
        new StudentDemo();
    }
}
