package demo.project;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Tic Tac Toe Game
 */
public class TicTacToe extends JFrame implements ActionListener {

    private static final String PATH = "assets/images/ttt/";
    private int counter;
    private JButton[] buttons = new JButton[9];

    /**
     * Constructor
     */
    private TicTacToe() {
        initComponent();
    }

    /**
     * 获取 button
     *
     * @return one button
     */
    private JButton getButton() {
        JButton button = new JButton();
        button.setBorder(new LineBorder(Color.WHITE, 1));
        button.setOpaque(true);
        Random r = new Random();
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(this);
        return button;
    }

    /**
     * 初始化组件
     */
    private void initComponent() {
        setTitle("Tic Tac Toe");
        setSize(100 * 3, 100 * 3);
        setUndecorated(true);
        setLocationRelativeTo(null);

        JPanel main = new JPanel();
        main.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < buttons.length; i++) {
            JButton button = getButton();
            button.setActionCommand(String.valueOf(i));
            buttons[i] = button;
            main.add(button);
        }

        add(main);
        setVisible(true);
    }


    /**
     * 按钮事件响应
     *
     * @param e 按钮事件
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("x") || e.getActionCommand().equals("o")) {
            return;
        }
        JButton curr = (JButton) e.getSource();
        String iconFile = (++counter % 2 == 0) ? "o" : "x";
        curr.setIcon(new ImageIcon(PATH + iconFile + ".png"));

        int currIndex = Integer.parseInt(curr.getActionCommand());
        buttons[currIndex].setActionCommand(iconFile);

        // begin: print current game in console
        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print("\t" + button.getActionCommand());
        }
        System.out.println();
        // endOf: print current game in console

        ai();

        if (isGameOver()) {
            showResult();
        }
    }

    /**
     * 显示游戏结果
     *
     * who is winner
     * by which line
     */
    private void showResult() {
        // TODO: 21/01/2019
    }

    /**
     * 判断游戏是否结束
     *
     * @return true if game over
     */
    private boolean isGameOver() {
        // TODO: 21/01/2019
        return  false;
    }

    /**
     * 计算机 AI
     *
     */
    private void ai() {
        // TODO: 21/01/2019 computer AI
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
