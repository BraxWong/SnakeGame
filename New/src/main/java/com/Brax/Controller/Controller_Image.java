package com.Brax.Controller;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Controller_Image {
    private static Controller_Image m_Controller_Image;

    /**
     * getM_Controller_Image() returns an object of Controller_Image
     * This is a singleton, that means only one stance of this object is
     * allowed.
     * @return
     */

    public static Controller_Image getM_Controller_Image(){
        if(m_Controller_Image == null){
            m_Controller_Image = new Controller_Image();
        }
        return m_Controller_Image;
    }

    /**
     * @Descripion
     * GetImage() will take the image path as an argument
     * If the image path and the image is found
     * It will return the image
     * Else the error will be caught
     */

    public Image getImage(String imagePath)
    {
        URL url = Controller_Leaderboard.class.getClassLoader().
                getResource(imagePath);
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(url);
        } catch (Exception e)
        {
            System.err.println("Images are not found \n");
            e.printStackTrace();
        }

        return image;
    }

    /**
     * @Description
     * Changing the variable to be more understandable.
     * Changed bufferedImaged to bf shortened the length of the code
     */
    public Image rotateImage(final BufferedImage bufferedImage, final int degree)
    {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int transparency = bufferedImage.getColorModel().getTransparency();

        BufferedImage image;
        Graphics2D graphics2d;

        (graphics2d =
                (image = new BufferedImage(width, height, transparency)).
                        createGraphics())
                .setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        graphics2d.rotate(Math.toRadians(degree), width / 2, height / 2);
        graphics2d.drawImage(bufferedImage, 0, 0, null);
        graphics2d.dispose();

        return image;
    }
}
