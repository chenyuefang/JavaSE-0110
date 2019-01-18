/*
 * Created by JFormDesigner on Fri Jan 18 14:54:35 CST 2019
 */

package demo.day08;

import java.awt.*;
import javax.swing.*;

/**
 * @author thuboy
 */
public class Test extends JFrame {
    public Test() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - thuboy
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1, BorderLayout.NORTH);

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - thuboy
    private JLabel label1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
