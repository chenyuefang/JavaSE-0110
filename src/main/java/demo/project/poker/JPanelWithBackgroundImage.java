package demo.project.poker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class JPanelWithBackgroundImage extends JPanel {

    private Image backgroundImage;

    JPanelWithBackgroundImage(String fileName)  {
        try {
            backgroundImage = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}