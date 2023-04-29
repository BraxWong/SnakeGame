package com.Brax.Model;

import com.Brax.Controller.Controller_Image;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Model_Images {

    /**
     * getM_Images() returns the current value of m_Images
     * @return m_Images
     */

    public static Map<String, Image> getM_Images() {
        return m_Images;
    }

    private static Map<String, Image> m_Images = new HashMap<>();
    static Controller_Image m_Controller_Image = Controller_Image.getM_Controller_Image();

   /**
    * m_Images.put() will retrieve an image based on the string using HashMap functions
    */

    static
    {
        // snake
        m_Images.put("snake-head-right", m_Controller_Image.getImage
                ("com/Brax/snakeModel/snake-head-right.png"));
        m_Images.put("snake-head-right2", m_Controller_Image.getImage
                ("com/Brax/snakeModel/snake-head-right2.png"));
        m_Images.put("snake-body", m_Controller_Image.getImage
                ("com/Brax/snakeModel/snake-body.png"));
        // obstacles
        m_Images.put("0", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-kiwi.png"));
        m_Images.put("1", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-lemon.png"));
        m_Images.put("2", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-litchi.png"));
        m_Images.put("3", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-mango.png"));
        m_Images.put("4", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-apple.png"));
        m_Images.put("5", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-banana.png"));
        m_Images.put("6", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-blueberry.png"));
        m_Images.put("7", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-cherry.png"));
        m_Images.put("8", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-durian.png"));
        m_Images.put("9", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-grape.png"));
        m_Images.put("10", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-grapefruit.png"));
        m_Images.put("11", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-peach.png"));
        m_Images.put("12", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-pear.png"));
        m_Images.put("13", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-orange.png"));
        m_Images.put("14", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-pineapple.png"));
        m_Images.put("15", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-strawberry.png"));
        m_Images.put("16", m_Controller_Image.getImage
                ("com/Brax/foodPNG/food-watermelon.png"));
        m_Images.put("UI-background", m_Controller_Image.getImage
                ("com/Brax/backgroundPNG/UI-background.png"));
        m_Images.put("UI-background2",m_Controller_Image.getImage
                ("com/Brax/backgroundPNG/UI-background2.png"));
        m_Images.put("UI-background3",m_Controller_Image.getImage
                ("com/Brax/backgroundPNG/UI-background3.jpg"));
        m_Images.put("game-scene-01", m_Controller_Image.getImage
                ("com/Brax/misc/game-scene-01.jpg"));
        m_Images.put("Fence",m_Controller_Image.getImage
                ("com/Brax/misc/Fence_Up.png"));
        m_Images.put("Fence_Right", m_Controller_Image.getImage
                ("com/Brax/misc/Fence_Right.png"));
        m_Images.put("Fence_Left", m_Controller_Image.getImage
                ("com/Brax/misc/Fence_Left.png"));
    }
}
