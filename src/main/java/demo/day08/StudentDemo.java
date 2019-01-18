package demo.day08;

import com.mysql.jdbc.Driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class StudentDemo extends JFrame implements ActionListener {

    private JPanel main;
    private JTextField usernameText;
    private JPasswordField passwordText;
    private JButton loginButton;
    private CardLayout cardLayout;

    private StudentDemo() {
        initComponent();
    }

    private void initComponent() {
        setTitle("Student Demo");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d);

        cardLayout = new CardLayout();

        main = new JPanel(cardLayout);

        JPanel login = new JPanel();
        JPanel home = new JPanel();

        usernameText = new JTextField();
        passwordText = new JPasswordField();

        loginButton = new JButton("LOGIN");
        loginButton.addActionListener(this);

        int x = (int) d.getWidth() / 2 - 100;
        int y = (int) d.getHeight() / 2;
        int width = 200;
        int height = 30;
        usernameText.setBounds(x, y, width, height);
        passwordText.setBounds(x, y + 50, width, height);
        loginButton.setBounds(x, y + 100, width, height);

        login.add(usernameText);
        login.add(passwordText);
        login.add(loginButton);

        login.setLayout(null);

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
            String username = usernameText.getText().trim();
            String password = new String(passwordText.getPassword());
            try {
                if (checkLogin(username, password)) {
                    cardLayout.show(main, "home");
                } else {
                    // TODO: 1/18/2019 显示登录失败信息
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    private boolean checkLogin(String username, String password) throws SQLException {
        new Driver();
        Connection connection = DriverManager.getConnection("jdbc:mysql:///?user=root&password=system");
        String sql = "select * from db_test.amdin where username = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();
        boolean canLogin = resultSet.next();

        resultSet.close();
        preparedStatement.close();
        connection.close();

        return canLogin;
    }

    public static void main(String[] args) {
        new StudentDemo();
    }
}
