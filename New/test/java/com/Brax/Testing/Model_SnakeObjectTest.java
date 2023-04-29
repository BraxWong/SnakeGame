package com.Brax.Testing;

import com.Brax.Model.Model_Images;
import com.Brax.Model.Model_SnakeObject;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Model_SnakeObjectTest {
    private Model_SnakeObject m_SnakeObject = new Model_SnakeObject() {
        @Override
        public void draw(Graphics g) {

        }
    };

    /**
     * aliveValidity() checks if the value of alive is equal to the test values,
     * after it has been set using setM_alive.
     * The first test will pass if it is equal to true.
     * The rest of them will fail since the test value is true.
     */

    @Test
    public void aliveValidity() {
        m_SnakeObject.setM_Alive(true);
        assertEquals(true,m_SnakeObject.getM_Alive());
        assertNotEquals(false,m_SnakeObject.getM_Alive());
        assertNotEquals(null,m_SnakeObject.getM_Alive());
    }

    /**
     * widthValidity() checks if the value of width is equal to the test values,
     * after it has been set using setM_width.
     * The first test will pass if it is equal to the test value.
     * The second test will pass if the test value being passed in is null,
     * which is not. So it will fail.
     */

    @Test
    public void widthValidity() {
        m_SnakeObject.setM_Width(20);
        assertEquals(20,m_SnakeObject.getM_Width());
        assertNotEquals((Integer) null,m_SnakeObject.getM_Width());
    }

    /**
     * heightValidity() checks if the value of height is equal to the test values,
     * after it has been set using setM_height.
     * The first test will pass if it is equal to the test value.
     * The second test will pass if the test value being passed in is null,
     * which is not. So it will fail.
     */

    @Test
    public void heightValidity() {
        m_SnakeObject.setM_Height(100);
        assertEquals(100,m_SnakeObject.getM_Height());
        assertNotEquals((Integer) null,m_SnakeObject.getM_Height());
    }

    /**
     * xCordValidity() checks if the value of x_Cord is equal to the test values,
     * after it has been set using setM_x_Cord.
     * The first test will pass if it is equal to the test value.
     * The second test will pass if the test value being passed in is null,
     * which is not. So it will fail.
     */

    @Test
    public void xCordValidity() {
        m_SnakeObject.setM_X_Cord(20);
        assertEquals(20,m_SnakeObject.getM_X_Cord());
        assertNotEquals((Integer) null,m_SnakeObject.getM_X_Cord());
    }

    /**
     * yCordValidity() checks if the value of y_Cord is equal to the test values,
     * after it has been set using setM_y_Cord.
     * The first test will pass if it is equal to the test value.
     * The second test will pass if the test value being passed in is null,
     * which is not. So it will fail.
     */

    @Test
    public void yCordValidity() {
        m_SnakeObject.setM_Y_Cord(20);
        assertEquals(20,m_SnakeObject.getM_Y_Cord());
        assertNotEquals((Integer) null,m_SnakeObject.getM_Y_Cord());
    }

    /**
     * imgValidity() checks if the value of M_image is equal to the test values,
     * after it has been set using setM_img.
     * The first test will pass if it is equal to null.
     * The second test will pass if the test value being
     * passed in is equal to the image.
     */

    @Test
    public void imgValidity() {
        m_SnakeObject.setM_Image(Model_Images.getM_Images().get("snake-body"));
        Image img = m_SnakeObject.getM_Image();
        assertNotEquals(img,null);
        assertEquals(img,Model_Images.getM_Images().get("snake-body"));
    }
}