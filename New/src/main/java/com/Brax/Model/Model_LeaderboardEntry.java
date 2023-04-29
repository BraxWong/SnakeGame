package com.Brax.Model;

public class Model_LeaderboardEntry {

    /**
     * setM_playerName() takes a String variable as argument,
     * then sets it to m_playerName
     * @param name
     */

    public void setM_PlayerName(String name) {this.m_PlayerName = name;}

    /**
     * getM_playerName() returns the current value of m_playerName
     * @return
     */

    public String getM_PlayerName() {return m_PlayerName;}

    /**
     * setM_score() takes an int variable as argument,
     * then sets it to m_score
     * @param score
     */

    public void setM_Score(int score){this.m_Score = score;}

    /**
     * getM_score() returns the current value of m_score
     * @return
     */

    public int getM_Score() {return m_Score;}

    /**
     * The constructor takes a String and an int variable as arguments,
     * then using setM_playerName(String var) and setM_score(int var)
     * to set the data
     * @param name
     * @param score
     */

    public Model_LeaderboardEntry(String name, int score) {

        setM_PlayerName(name);

        setM_Score(score);

    }

    private String m_PlayerName;
    private int m_Score;

}
