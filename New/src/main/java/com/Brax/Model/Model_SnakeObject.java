package com.Brax.Model;

import java.awt.*;

public abstract class Model_SnakeObject {

    /**
     * setM_Alive() takes a boolean as argument,
     * then sets m_Alive to the argument's value
     * @param alive
     */

    public void setM_Alive(boolean alive){this.m_Alive = alive;}

    /**
     * setM_Width() takes an int as argument,
     * then sets m_Width to the argument's value
     * @param width
     */
    public void setM_Width(int width){this.m_Width = width;}

    /**
     * setM_Height() takes an int as argument,
     * then sets m_Height to the argument's value
     * @param height
     */
    public void setM_Height(int height){this.m_Height = height;}

    /**
     * setM_X_Cord() takes an int as argument,
     * then sets m_X_Cord to the argument's value
     * @param x_Cord
     */
    public void setM_X_Cord(int x_Cord){this.m_X_Cord = x_Cord;}

    /**
     * setM_Y_Cord() takes an int as argument,
     * then sets m_Y_Cord to the argument's value
     * @param y_Cord
     */

    public void setM_Y_Cord(int y_Cord){this.m_Y_Cord = y_Cord;}

    /**
     * getM_X_Cord() returns the current value of m_X_Cord
     * @return m_X_Cord
     */

    public int getM_X_Cord(){return m_X_Cord;}

    /**
     * getM_Y_Cord() returns the current value of m_Y_Cord
     * @return m_Y_Cord
     */
    public int getM_Y_Cord(){return m_Y_Cord;}

    /**
     * getM_Width() returns the current value of m_Width
     * @return m_Width
     */

    public int getM_Width(){return m_Width;}

    /**
     * getM_Height() returns the current value of m_Height
     * @return m_Height
     */

    public int getM_Height() {return m_Height;}
    /**
     * getM_Alive() returns the current value of m_alive
     * @return m_Alive
     */

    public boolean getM_Alive(){return m_Alive;}

    /**
     * getM_Image() returns the current image of m_image
     * @return m_Image
     */

    public Image getM_Image() {return m_Image;}


    /**
     * setM_image() takes an Image object as argument,
     * then sets m_Image to the argument's value
     * @param image
     */

    public void setM_Image(Image image) {this.m_Image = image;}

    /**
     * getRectangle() creates a new Rectangle object with m_X_Cord,
     * m_Y_Cord, m_Width, and m_Height as parameters.
     * Then return the newly created Rectangle object
     * @return Rectangle Object
     */
    public Rectangle getRectangle() {
        return new Rectangle(m_X_Cord, m_Y_Cord, m_Width, m_Height);
    }

    private int m_X_Cord;

    private int m_Y_Cord;

    Image m_Image;

    private int m_Width;

    private int m_Height;

    private boolean m_Alive;

    public abstract void draw(Graphics g);
}

