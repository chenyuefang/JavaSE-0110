package demo.project.poker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ImageLabel extends JLabel {

    ImageLabel(String img, int width, int height) throws IOException {
        BufferedImage bufferedImage = null;
        bufferedImage = ImageIO.read(new File(img));
        assert bufferedImage != null;
        Image dimg = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setIcon(new ImageIcon(dimg));
    }
/*
    private ImageLabel(ImageIcon icon) {
        setIcon(icon);
        // setMargin(new Insets(0,0,0,0));
        setIconTextGap(0);
        // setBorderPainted(false);
        setBorder(null);
        setText(null);
        setSize(icon.getImage().getWidth(null) / 10, icon.getImage().getHeight(null) / 10);
    }
    */
}
