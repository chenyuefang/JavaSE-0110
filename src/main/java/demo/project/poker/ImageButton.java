package demo.project.poker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ImageButton extends JButton {

    ImageButton(String img, int width, int height) throws IOException {
        BufferedImage bufferedImage = null;
        bufferedImage = ImageIO.read(new File(img));
        assert bufferedImage != null;
        Image dimg = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(dimg));

        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
    }
}
