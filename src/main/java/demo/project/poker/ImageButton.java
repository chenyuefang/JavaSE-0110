package demo.project.poker;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ImageButton extends JButton {

    private String imagePath;

    ImageButton(String img, int width, int height) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(img));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert bufferedImage != null;
        Image dimg = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(dimg));

        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBorder(new LineBorder(null, 20));

        setImagePath(img);
    }

    String getImagePath() {
        return imagePath;
    }

    private void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
