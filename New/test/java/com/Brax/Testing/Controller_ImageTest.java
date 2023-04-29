package com.Brax.Testing;

import static com.Brax.Model.Model_SettingsOptions.getM_SettingsOptions;
import static org.junit.jupiter.api.Assertions.*;

import com.Brax.Controller.Controller_Image;
import org.junit.jupiter.api.Test;

import java.awt.*;

class Controller_ImageTest {
    public final int NINETY = 90;

    private Controller_Image m_Controller_Image = Controller_Image.getM_Controller_Image();

    /**
     * checkObjectValue() checks the value of m_controller_Image.
     * The test will fail if it is null
     */

    @Test
    public void checkObjectValue() {
        assertNotEquals(m_Controller_Image,null);
    }
    /**
     * checkImageValue() checks the value of img after GetImage()
     * has been called.
     * The test will fail if it is null.
     */

    @Test
    public void checkImageValue() {
        Image img = m_Controller_Image.getImage("com/Brax/snakeModel/snake-head-right.png");
        assertNotEquals(img,null);
    }

    /**
     * checkRotatedSnakeHeadValue() checks if the value of img after
     * RotateImage() has been called, which is used to rotate the snake head model.
     * The test will fail it is null.
     */
    @Test
    public void checkRotatedSnakeHeadValue() {
        Image img = m_Controller_Image.rotateImage(getM_SettingsOptions().getSnakeHead(),NINETY);
        assertNotEquals(img,null);
    }

}