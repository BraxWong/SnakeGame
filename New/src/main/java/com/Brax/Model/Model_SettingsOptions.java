package com.Brax.Model;


import java.awt.image.BufferedImage;

public class Model_SettingsOptions {

    private static Model_SettingsOptions m_SettingsOptions;

    /**
     * getM_SettingsOptions() is a singleton method which only allows
     * 1 instance of Model_SettingsOptions object to be created.
     * If m_SettingsOptions == null, it means the object has not been created yet,
     * if it is not equal to null, that means the object has already been created,
     * hence returning m_settingsOptions.
     * @return m_SettingsOptions
     */
    public static Model_SettingsOptions getM_SettingsOptions() {
        if(m_SettingsOptions == null){
            m_SettingsOptions = new Model_SettingsOptions();
        }
        return m_SettingsOptions;
    }
    /**
     * getSpeed() returns the movement speed of the snake
     * @return m_Speed
     */
    public int getSpeed() {return m_Speed; }

    /**
     * setSpeed() takes in the speed as an argument,
     * check it with a JUnit class to see if it is either
     * 5, 10, or 15.
     * Then it will set m_speed with the argument value
     * @param speed
     */

    public void setSpeed(int speed) {
        m_Speed = speed;
    }

    /**
     * getM_backgroundImg() returns the current value of m_backgroundImg,
     * which determines which background image to use for the game.
     * @return m_backgroundImg
     */

    public int getM_BackgroundImg() {
        return m_BackgroundImg;
    }

    /**
     * setM-backgroundImg() takes an int as argument,
     * check it with a JUnit class to see if it is either
     * 1, 2, or 3.
     * Then it will set m_backgroundImg with the argument value
     * @param backgroundImgInt
     */

    public void setM_BackgroundImg(int backgroundImgInt) {
        m_BackgroundImg = backgroundImgInt;
    }

    /**
     * getSnakeHead() returns a BufferedImage object,
     * after checking getting the integer from snakeHeadImg using
     * getM_snakeHeadImg.
     * If getM_snakeHeadImg is 1, it will use m_images.get method within
     * Model_Images class to get the appropriate image.
     * If it returns 2, it will get a variation of the snake head image.
     * @return BufferedImage
     */

    public BufferedImage getSnakeHead() {
        if(getM_SnakeHeadImg() == 1){
            return (BufferedImage) Model_Images.getM_Images().
                    get("snake-head-right");
        }
        return (BufferedImage) Model_Images.getM_Images().get("snake-head-right2");
    }

    /**
     * getM_snakeHeadImg() returns the current value of m_snakeHeadImg
     * @return m_snakeHeadImg
     */

    public int getM_SnakeHeadImg() {
        return m_SnakeHeadImg;
    }

    /**
     * setM_snakeHeadImg() takes an int as argument,
     * check it with a JUnit class to see if it is either
     * 1 or 2.
     * Then it will set m_snakeHeadImg with the argument value
     * @param snakeHeadImgInt
     */

    public void setM_SnakeHeadImg(int snakeHeadImgInt) {
        m_SnakeHeadImg = snakeHeadImgInt;
    }

    /**
     * getM_name() returns the current value of m_name,
     * which represents the player's name.
     * @return m_name
     */

    public String getM_Name() { return m_Name; }

    /**
     * setM_name() takes a String as argument,
     * check it with a JUnit class to see if the length of the argument
     * is not NULL, then it will set m_name with the argument value
     * @param name
     */

    public void setM_Name(String name) {
        m_Name = name;
    }

    private int m_BackgroundImg = 1;

    private int m_SnakeHeadImg = 1;

    private int m_Speed;

    private String m_Name;

}
