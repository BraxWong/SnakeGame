package com.Brax.Model;

import com.Brax.Controller.Controller_Image;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import static com.Brax.Model.Model_SettingsOptions.getM_SettingsOptions;


public class Model_MySnake extends Model_SnakeObject {




    /**
     * SetM_newImgSnakeHead() takes a BufferedImage object as argument,
     * then sets m_newImgSnakeHead to have the argument's value
     * @param image
     */

    public void setM_newImgSnakeHead(BufferedImage image){this.m_NewImgSnakeHead = image;}

    /**
     * SetM_speed_XY() takes an int as argument,
     * then sets m_speed_XY to have the argument's value
     * @param speed_xy
     */

    public void setM_Speed_XY(int speed_xy){this.m_Speed_XY = speed_xy;}

    /**
     * ChangeM_length() takes an int as argument,
     * then sets m_length to have the argument's value
     * @param length
     */

    public void setM_Length(int length){this.m_Length = length;}

    /**
     * SetM_num() takes an int as argument,
     * then sets m_num to have the argument's value
     * @param num
     */

    public void setM_Num(int num){this.m_Num = num;}

    /**
     * SetM_score() takes an int as argument,
     * then sets m_score to have the argument's value
     * @param score
     */

    public void setM_Score(int score){this.m_Score = score;}

    /**
     * GetM_score() returns the current value of m_score
     * @return
     */

    public int getM_Score(){return m_Score;}

    /**
     * GetM_Length() returns the current value of m_length
     * @return m_Length
     */
    public int getM_Length() {return m_Length;}
    public static final int FRAME_WIDTH = 785;
    public static final int FRAME_HEIGHT = 455;
    public static final int FENCE_WIDTH = 67;
    public static final int FENCE_HEIGHT = 57;
    public static final int NINETY = 90;
    public static final int NEG_NINETY = -90;
    public static final int NEG_ONE_EIGHTY = -180;
    private int m_Speed_XY;
    private int m_Length;
    private int m_Num;
    private int m_Score = 0;
    private Model_SettingsOptions m_SettingsOptions = Model_SettingsOptions.getM_SettingsOptions();
    private static BufferedImage m_IMG_SNAKE_HEAD = getM_SettingsOptions().getSnakeHead();
    public static List<Point> m_BodyPoints = new LinkedList<>();
    private static BufferedImage m_NewImgSnakeHead;

    boolean m_Up, m_Down, m_Left, m_Right = true;

    /**
     * Model_MySnake constructor takes two int as arguments,
     * sets m_alive as true, m_x_cord and m_y_cord to the arguments,
     * setM_image() to set the body of the snake using m_images to get the
     * appropriate image.
     * Sets the width and height of the image as null for the observer.
     * Sets the speed of the snake using SetM_speed_XY().
     * Sets the length of the snake using ChangeM_length().
     * Sets m_num using SetM_num().
     * Sets the image of the snake head using SetM_newImgSnakeHead().
     * @param x
     * @param y
     */

    public Model_MySnake(int x, int y)
    {
        setM_Alive(true);

        setM_X_Cord(x);

        setM_Y_Cord(y);

        setM_Image(Model_Images.getM_Images().get("snake-body"));

        setM_Width(getM_Image().getWidth(null));

        setM_Height(getM_Image().getHeight(null));

        setM_Speed_XY(m_SettingsOptions.getSpeed());

        setM_Length(1);

        setM_Num(getM_Width() / m_SettingsOptions.getSpeed());

        setM_newImgSnakeHead(m_IMG_SNAKE_HEAD);

    }

    /**
     * keyPressed dictates the direction of where the snake head points.
     * If the user pressed up, it will rotate m_IMG_SNAKE_HEAD -90 degrees,
     * If the user pressed down, it will rotate m_IMG_SNAKE_HEAD 90 degrees,
     * If the user pressed left, it will rotate m_IMG_SNAKE_HEAD -180 degrees,
     * If the user pressed right, m_IMG_SNAKE_HEAD will not be rotated.
     * @param e
     */
    public void keyPressed(KeyEvent e)
    {
        Controller_Image controller_image = Controller_Image.getM_Controller_Image();
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_UP:
                if (!m_Down)
                {
                    m_Up = true;
                    m_Down = false;
                    m_Left = false;
                    m_Right = false;
                    setM_newImgSnakeHead((BufferedImage) controller_image.
                            rotateImage(m_IMG_SNAKE_HEAD, NEG_NINETY));
                }
                break;

            case KeyEvent.VK_DOWN:
                if (!m_Up)
                {
                    m_Up = false;
                    m_Down = true;
                    m_Left = false;
                    m_Right = false;
                    setM_newImgSnakeHead((BufferedImage) controller_image.
                            rotateImage(m_IMG_SNAKE_HEAD, NINETY));
                }
                break;
            case KeyEvent.VK_LEFT:
                if (!m_Right)
                {
                    m_Up = false;
                    m_Down = false;
                    m_Left = true;
                    m_Right = false;
                    setM_newImgSnakeHead((BufferedImage) controller_image.
                            rotateImage(m_IMG_SNAKE_HEAD, NEG_ONE_EIGHTY));

                }
                break;

            case KeyEvent.VK_RIGHT:
                if (!m_Left)
                {
                    m_Up = false;
                    m_Down = false;
                    m_Left = false;
                    m_Right = true;
                    setM_newImgSnakeHead(m_IMG_SNAKE_HEAD);
                }
            default:
                break;
        }
    }

    /**
     * move()
     * If it is m_Up, it will get the current,
     * m_y_cord and subtract the speed of the snake,
     * then store it back to m_y_cord.
     * If it is m_Down, it will get the current,
     * m_y_cord and increase the speed of the snake,
     * then store it back to m_y_cord.
     * If it is m_Left, it will get the current,
     * m_x_cord and decrease the speed of the snake,
     * then store it back to m_x_cord.
     * If it is m_Right, it will get the current,
     * m_x_cord and increase the speed of the snake,
     * then store it back to m_x_cord.
     */
    public void move()
    {

        if (m_Up)
        {
            setM_Y_Cord(getM_Y_Cord()- m_Speed_XY);
        } else if (m_Down)
        {
            setM_Y_Cord(getM_Y_Cord()+ m_Speed_XY);
        } else if (m_Left)
        {
            setM_X_Cord(getM_X_Cord()- m_Speed_XY);
        } else if (m_Right)
        {
            setM_X_Cord(getM_X_Cord()+ m_Speed_XY);
        }
    }

    /**
     * draw() takes a Graphics object as argument,
     * it will first call outOfBounds() to check if the snake is out of bound,
     * then it will call eatBody() to check if the snake is eating itself,
     * then it will add to m_bodyPoints according x_cord and y_cord.
     * the first index of m_bodyPoints will be removed if the size of the list,
     * is equal to the size of the snake + 1 and multiply by m_num.
     * If it is not equal,
     * it will call drawImage() method within Graphics class to draw
     * the snakeHead with m_newImgSnakeHead at x,y_cord.
     * It will call drawBody() by passing in a Graphics object to
     * draw the body.
     * It will then call move()
     * @param g
     */
    @Override
    public void draw(Graphics g)
    {
        outOfBounds();
        eatBody();
        m_BodyPoints.add(new Point(getM_X_Cord(), getM_Y_Cord()));
        if (m_BodyPoints.size() == (getM_Length() + 1) * m_Num)
        {
            m_BodyPoints.remove(0);
        }
        g.drawImage(m_NewImgSnakeHead, getM_X_Cord(), getM_Y_Cord(), null);
        drawBody(g);
        move();
    }


    /**
     * eatBody() checks if the snake head is making contact with its
     * body by running two for loops on the m_bodyPoints list and
     * check the two pointers are equal to each other.
     * If they are equal, it will set M_alive to false.
     * If they are not equal, it will end the method if it
     * is not able to find a match after running the entire
     * list.
     */

    public void eatBody()
    {
        for (Point point : m_BodyPoints)
        {
            for (Point point2 : m_BodyPoints)
            {
                if (point.equals(point2) && point != point2)
                {
                    setM_Alive(false);
                }
            }
        }
    }

    /**
     * drawBody() takes a Graphics object as argument.
     * It will store the result of the size of m_bodyPoints list
     * subtracted with 1 and m_num to length.
     * Then running a for loop to draw the snake body
     * @param g
     */

    public void drawBody(Graphics g)
    {
        int length = m_BodyPoints.size() - 1 - m_Num;
        for (int i = length; i >= m_Num; i -= m_Num)
        {
            Point point = m_BodyPoints.get(i);
            g.drawImage(getM_Image(), point.x, point.y, null);
        }
    }

    /**
     * outOfBounds() checks if the snake is out of bounds.
     * It will check the current x_cord with the FENCE_WIDTH and
     * y_cord with the FENCE_HEIGHT.
     * If one of them come back true, it is out of bound,
     * which will set m_alive to false.
     */

    private void outOfBounds()
    {

        boolean xOut = (getM_X_Cord() <= FENCE_WIDTH || getM_X_Cord() >= FRAME_WIDTH);
        boolean yOut = (getM_Y_Cord() <= FENCE_HEIGHT || getM_Y_Cord() >= FRAME_HEIGHT);
        if (xOut || yOut)
        {
            setM_Alive(false);
        }
    }
}

