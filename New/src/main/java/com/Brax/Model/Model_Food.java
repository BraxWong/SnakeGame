package com.Brax.Model;

import java.awt.*;
import java.util.Random;

public class Model_Food extends Model_MySnake {
    public final int TEN = 10;
    public final int MAX_X_PX = 550;
    public final int MAX_Y_PX = 300;
    public final int FIFTY = 50;

    /**
     * Food() constructor
     * Setting snake object class variables
     * super(x,y) will set the location of the snake
     * SetM_alive() will determine if the snake is alive or not
     * this.m_image will be the fruit image
     * SetM_width() and SetM_height() will set
     * where the fruit image will appear
     */
    public Model_Food()	{

        super(100,100);

        setM_Alive(true);

        setM_Image(Model_Images.getM_Images().get(String.valueOf(
                new Random().nextInt(TEN))));

        setM_Width(getM_Image().getWidth(null));

        setM_Height(getM_Image().getHeight(null));

        setM_X_Cord(new Random().nextInt(MAX_X_PX) + FIFTY);

        setM_Y_Cord(new Random().nextInt(MAX_Y_PX) + FIFTY);
    }

    /**
     * eaten() checks if the snake has eaten itself
     * It will set the snake alive status to false,
     * Change the length of the snkae
     * Obtaining the score and increment it by 10.
     * @param modelMySnake
     * @return
     */

    public boolean eaten(Model_MySnake modelMySnake)	{

        if (modelMySnake.getRectangle().intersects(this.getRectangle()) &&
                getM_Alive() && modelMySnake.getM_Alive())	{

            setM_Alive(false);

            modelMySnake.setM_Length(modelMySnake.getM_Length() + 1);

            int score = modelMySnake.getM_Score();

            modelMySnake.setM_Score(score+=TEN);

            return true;
        }
        return false;

    }

    /**
     * draw() puts the fruit image to the playing field
     * @param g
     */
    @Override
    public void draw(Graphics g) {

        g.drawImage(getM_Image(), getM_X_Cord(), getM_Y_Cord(), null);

    }
}
