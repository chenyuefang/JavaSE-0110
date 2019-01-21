package demo.project;

import com.sun.glass.events.WindowEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tic Tac Toe Game
 */
public class TicTacToe extends JFrame implements ActionListener {

    private static final String PATH = "assets/images/ttt/";
    private int counter;
    private JPanel main;
    private JButton[] buttons = new JButton[9];
    private boolean isGameOver;
    private int[] result;

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
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(this);
        return button;
    }

    /**
     * 初始化组件
     */
    private void initComponent() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(100 * 3, 100 * 3);
        setTitle("Tic Tac Toe");
        setLocationRelativeTo(null);

        main = new JPanel();
        main.setLayout(new GridLayout(3, 3));

        initButtons(main);

        add(main);
        setVisible(true);
    }

    private void initButtons(JPanel main) {
        for (int i = 0; i < buttons.length; i++) {
            JButton button = getButton();
            button.setBackground(null);
            button.setActionCommand(String.valueOf(i));
            buttons[i] = button;
            main.add(button);
        }
    }


    /**
     * 按钮事件响应
     *
     * @param e 按钮事件
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isGameOver) {
            newGame();
            return;
        }
        if (e.getActionCommand().matches("[xo]+")) {
            return;
        }
        JButton curr = (JButton) e.getSource();
        String iconFile = (++counter % 2 == 0) ? "o" : "x";
        curr.setIcon(new ImageIcon(PATH + iconFile + ".png"));

        int currIndex = Integer.parseInt(e.getActionCommand());
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

        checkGameOver();

        if (isGameOver) {
            System.out.println("--- game over ---");
            showResult();
        }
    }

    private void newGame() {
        setTitle("Tic Tac Toe");
        main.removeAll();
        initButtons(main);
        main.revalidate();
        main.repaint();
        isGameOver = false;
        result = new int[3];
        counter = 0;
    }

    /**
     * 显示游戏结果
     * <p>
     * who is winner
     * by which line
     */
    private void showResult() {
        if (result == null) {
            setTitle("平局");
            return;
        }
        String s = buttons[result[0]].getActionCommand();
        for (int i : result) {
            buttons[i].setBackground(Color.orange);
        }
        if (s.equals("x")) {
            setTitle("玩家胜");
        } else {
            setTitle("AI胜");
        }
    }

    /**
     * 判断游戏是否结束
     */
    private void checkGameOver() {
        int[][] results = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // row
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // col
                {0, 4, 8}, {2, 4, 6} // diagonal
        };

        for (int[] result : results) {
            if (isLine(result)) {
                isGameOver = true;
                this.result = result;
            }
        }
        if (counter == 9) {
            isGameOver = true;
            this.result = null;
        }
    }

    private boolean isLine(int[] result) {
        String aString = buttons[result[0]].getActionCommand();
        String bString = buttons[result[1]].getActionCommand();
        String cString = buttons[result[2]].getActionCommand();
        return aString.equals(bString) && bString.equals(cString);
    }

    /**
     * 计算机 AI
     */
    private void ai() {
        // TODO: 21/01/2019 computer AI
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
