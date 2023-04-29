package com.Brax;

import com.Brax.Controller.Controller_FileSystem;
import com.Brax.Model.*;
import com.Brax.View.View_MyFrame;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Play extends View_MyFrame
{

    /**
     * Constructor for Play class
     * It is called from Controller_Levels when the play button is pressed
     * Then it will retrieve relevant information from SettingsOptions class
     * ie background IMG and player's name before the game begins
     */

    public Play(){

        if(m_SettingsOptions.getM_BackgroundImg() == 1){

            setM_Background("UI-background");

        }

        else if(m_SettingsOptions.getM_BackgroundImg() == 2){

            setM_Background("UI-background2");

        }

        else {

            setM_Background("UI-background3");

        }

        setM_PlayerName(m_SettingsOptions.getM_Name());

        setM_mySnake(new Model_MySnake(100,100));

    }

    /**
     * setM_mySnake takes a MySnake object as argument,
     * then set m_mySnake to this.m_mySnake.
     * This is used within the constructor
     * @param m_Model_mySnake
     */

    public void setM_mySnake(Model_MySnake m_Model_mySnake) {
        this.m_Model_MySnake = m_Model_mySnake;
    }

    /**
     * getM_mySnake returns m_mySnake,
     * which is a MySnake object
     * @return
     */

    public Model_MySnake getM_mySnake() {
        return m_Model_MySnake;
    }

    /**
     * getM_background() returns the background image
     */

    public Image getM_Background(){return m_Background;}

    /**
     * setM_background takes a String variable as argument
     * then retrieve the image based on the String from the Model class
     * then sets it to m_background
     * @param str
     */

    public void setM_Background(String str){this.m_Background = Model_Images.getM_Images().get(str);}

    /**
     * getPlayerName() returns the name of the player
     * @return
     */

    public String getM_PlayerName() {return m_PlayerName;}

    /**
     * setPlayerName() takes a String variable as argument
     * and sets it to the playerName
     * @param name
     */

    public void setM_PlayerName(String name){this.m_PlayerName = name;}

    /**
     * Creates a MySnake object and sets its location at 100,100
     * (x,y coordinates)
     */

    public Model_MySnake m_Model_MySnake = new Model_MySnake(100,100);

    private Model_SettingsOptions m_SettingsOptions = Model_SettingsOptions.getM_SettingsOptions();
    /**
     * Creates a Food object
     */

    public Model_Food m_Model_Food = new Model_Food();
    private Image m_Background,

    /**
     * Storing all fence related images for later use
     */

    m_FenceUp = Model_Images.getM_Images().get("Fence"),

    m_FenceLeft = Model_Images.getM_Images().get("Fence_Left"),

    m_FenceRight = Model_Images.getM_Images().get("Fence_Right");

    /**
     * num is used to make sure the csv file will not append
     * more than 1 time after the game has ended
     */
    public int m_Num = 0;
    public final int TOP_X = 355;

    public final int ABS_X_CENTER = 300;

    public final int ABS_Y_CENTER = 330;

    public final int TOP_Y = 40;
    public final int SIZE_OF_FONT = 30;

    public final int MAX_X_AXIS = 870;

    public final int MAX_Y_AXIS = 485;

    public final int FENCE_WIDTH = 58;
    public final int FENCE_HEIGHT = 57;
    public final int FRAME_X = 812;
    public final int FRAME_Y = 480;
    private String m_PlayerName;

    @Override
    public void keyPressed(KeyEvent e)
    {

        super.keyPressed(e);

        m_Model_MySnake.keyPressed(e);

    }

    /**
     * This is called when Play.load() is called.
     * It will paint the background IMG, food IMG, and the fences
     * around the borders.
     * If the snake is dead, the program will display the endScreen,
     * then redraw the score and place it in the center of the screen.
     * It will create a FileSystem object so the program can append the
     * player name and the final score to record.csv file for the leaderboard.
     * If the snake is alive, the program will redraw the score string after
     * adding 10 points to the current score then display it on the screen
     * @param g  the <code>Graphics</code> context in which to paint
     */

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(m_Background, 0, 0, null);
        for(int i = 0; i < MAX_X_AXIS; i += FENCE_WIDTH){
            g.drawImage(m_FenceUp,i,0,null);
            g.drawImage(m_FenceUp,i,FRAME_Y,null);
        }
        for(int i = FENCE_HEIGHT; i < MAX_Y_AXIS; i += FENCE_HEIGHT){
            g.drawImage(m_FenceLeft,0,i,null);
            g.drawImage(m_FenceRight,FRAME_X,i,null);
        }
        if (m_Model_MySnake.getM_Alive()) {
            m_Model_MySnake.draw(g);
            if (m_Model_Food.getM_Alive()) {
                m_Model_Food.draw(g);
                m_Model_Food.eaten(m_Model_MySnake);
            } else {
                m_Model_Food = new Model_Food();
            }
        } else {
            g.drawImage(Model_Images.getM_Images().get("game-scene-01"), 0, 0,
                    null);
            drawScore(g, true);
            if (m_Num == 0) {

                Controller_FileSystem fs = new Controller_FileSystem();
                try {
                   fs.createScoreFile(getM_PlayerName(),
                            m_Model_MySnake.getM_Score());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                ++m_Num;
            }
            return;
        }
            drawScore(g, false);
    }

    /**
     * drawScore() takes a Graphics and boolean as arguments.
     * boolean dead determines whether where the score will be drawn
     * on the screen.
     * If the snake is dead, it will retrieve the score using GetM_score(),
     * then display it at the center of the screen
     * If the snake is alive, it will retrieve the score using GetM_score(),
     * then display at the center in terms of x-axis
     * @param g
     * @param dead
     */

    public void drawScore(Graphics g, boolean dead)
    {

        int score = m_Model_MySnake.getM_Score();

        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, SIZE_OF_FONT));

        g.setColor(Color.MAGENTA);

        if(!dead){

            g.drawString("SCORE : " + score, TOP_X, TOP_Y);

            return;

        }

        g.drawString("FINAL SCORE : " + score, ABS_X_CENTER, ABS_Y_CENTER );

    }

}


