package com.Brax.Controller;

import com.Brax.Model.Model_Scenes;
import com.Brax.Model.Model_SettingsOptions;
import com.Brax.Controller_SceneControl;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class Controller_Settings {
    /**
     *(Settings Screen)
     * m_Background1, m_Background2, m_Background3,
     * m_SnakeHead1, and m_SnakeHead2 belong to the Settings page
     */
    @FXML
    private RadioButton m_Background1;

    @FXML
    private RadioButton m_Background2;

    @FXML
    public RadioButton m_Background3;

    @FXML
    private RadioButton m_SnakeHead1;

    @FXML
    private RadioButton m_SnakeHead2;

    private ToggleGroup m_BackgroundGroup = new ToggleGroup();

    private ToggleGroup m_SnakeHeadGroup = new ToggleGroup();

    private Model_SettingsOptions m_SettingsOptions =
            Model_SettingsOptions.getM_SettingsOptions();

    /**
     * @Description
     * selBackground1(), selBackground2(), and selBackground3()
     * are used by the radioButtons. When one of them is clicked,
     * it will be added to the ToggleGroup to prevent multiple
     * radioButtons from being selected at the same time.
     * When the radioButton is clicked, it will store the backgroundIMG being
     * selected to the SettingsOptions class.
     */
    public void selBackground1(){
        m_Background1.setToggleGroup(m_BackgroundGroup);
        if(m_Background1.isSelected()){
            m_SettingsOptions.setM_BackgroundImg(1);
        }
    }
    public void selBackground2() {
        m_Background2.setToggleGroup(m_BackgroundGroup);
        if(m_Background2.isSelected()) {
            m_SettingsOptions.setM_BackgroundImg(2);
        }
    }

    public void selBackground3() {
        m_Background3.setToggleGroup(m_BackgroundGroup);
        if(m_Background3.isSelected()) {
            m_SettingsOptions.setM_BackgroundImg(3);
        }
    }

    /**
     * @Description
     * selSnakeHead1(), and selSnakeHead2() work very similar to selBackground().
     * When one of them is clicked,
     * it will be added to the ToggleGroup to prevent multiple
     * radioButtons from being selected at the same time.
     * When the radioButton is clicked, it will store the snakeHeadIMG being
     * selected to the SettingsOptions class.
     */
    public void selSnakeHead1() {
        m_SnakeHead1.setToggleGroup(m_SnakeHeadGroup);
        if(m_SnakeHead1.isSelected()) {
            m_SettingsOptions.setM_SnakeHeadImg(1);
        }
    }

    public void selSnakeHead2() {
        m_SnakeHead2.setToggleGroup(m_SnakeHeadGroup);
        if(m_SnakeHead2.isSelected()){
            m_SettingsOptions.setM_SnakeHeadImg(2);
        }
    }

    /**
     * @Descripion
     * The settings screen contains a back button,
     * which allows users to go back to the main menu.
     * @throws IOException
     */

    public void switchToMenu() throws IOException {
        Controller_SceneControl.switchScene(Model_Scenes.Menu);
    }

}
