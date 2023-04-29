package com.Brax.Testing;

import com.Brax.Model.Model_MusicPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class Model_MusicPlayerTest {
    private Model_MusicPlayer m_MusicPlayer = new Model_MusicPlayer();

    /**
     * checkFileName() checks the filePath within
     * the Model_MusicPlayer model after
     * storing it in filePath using getM_filename().
     * If it is equal to the actual path, the test will pass.
     * Else, the test will fail.
     */

    @Test
    public void checkFileName() {
        String filePath = m_MusicPlayer.getM_FileName();
        assertEquals(filePath,"src/com/Brax/misc/frogger.mp3");
    }

    /**
     * checkPlayerValue will check if the Player object value within the
     * MusicPlayer class isn't equal to null.
     * If it is null, the test will fail.
     * Else, the test will pass.
     * @throws FileNotFoundException
     * @throws JavaLayerException
     */


    @Test
    public void checkPlayerValue() throws FileNotFoundException, JavaLayerException {
        m_MusicPlayer.setM_Player(new Player(new BufferedInputStream(new FileInputStream(m_MusicPlayer.getM_FileName()))));
        assertNotEquals(m_MusicPlayer.getM_Player(),null);
    }
}