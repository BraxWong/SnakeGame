package com.Brax.Model;

import javazoom.jl.player.Player;

public class Model_MusicPlayer {
    /**
     * setM_Player() takes a Player object as argument,
     * then sets m_Player to the argument's value
     * @param player
     */

    public void setM_Player(Player player) {this.m_Player = player;}

    /**
     * getM_Player() returns the current value of m_Player
     * @return m_Player
     */

    public Player getM_Player() {
        return m_Player;
    }

    /**
     * getM_FileName() returns the current value of m_filename
     * @return m_FileName
     */

    public String getM_FileName() {
        return m_FileName;
    }

    private String m_FileName = "src/main/java/com/Brax/misc/frogger.mp3";
    private Player m_Player;
}
