package com.Brax.Testing;

import com.Brax.Model.Model_Scenes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Model_ScenesTest {
    private Model_Scenes m_ModelScenes;

    /**
     * checkMenuPath() checks Menu type's filePath by calling
     * getFilePath and comparing it to the location of MenuScreen.fxml.
     * If it is equal to each other, the test will pass.
     * Else, the test will fail.
     */

    @Test
    public void checkMenuPath() {
        assertEquals(m_ModelScenes.Menu.getFilePath(),"FXMLsb/MenuScreen.fxml");
    }

    /**
     * checkSettingsPath() checks Settings type's filePath by calling
     * getFilePath and comparing it to the location of SettingsScreen.fxml.
     * If it is equal to each other, the test will pass.
     * Else, the test will fail.
     */

    @Test
    public void checkSettingsPath() {
        assertEquals(m_ModelScenes.Settings.getFilePath(),"FXMLsb/SettingsScreen.fxml");
    }

    /**
     * checkLeaderboardPath() checks Leaderboard type's filePath by calling
     * getFilePath and comparing it to the location of LeaderboardScreen.fxml.
     * If it is equal to each other, the test will pass.
     * Else, the test will fail.
     */

    @Test
    public void checkLeaderboardPath() {
        assertEquals(m_ModelScenes.Leaderboard.getFilePath(),"FXMLsb/LeaderboardScreen.fxml");
    }

    /**
     * checkLevelPath() checks Level type's filePath by calling
     * getFilePath and comparing it to the location of LevelScreen.fxml.
     * If it is equal to each other, the test will pass.
     * Else, the test will fail.
     */

    @Test
    public void checkLevelPath() {
        assertEquals(m_ModelScenes.Level.getFilePath(),"FXMLsb/LevelScreen.fxml");
    }
}