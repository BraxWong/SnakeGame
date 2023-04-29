package com.Brax.Testing;

import com.Brax.Model.Model_LeaderboardEntry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Model_LeaderboardEntryTest {
    private Model_LeaderboardEntry m_LeaderboardEntry = new Model_LeaderboardEntry(null,0);

    /**
     * checkPlayerNameNull() checks if m_LeaderboardEntry's
     * playerName is equal to null
     * after it has been set using setM_playerName() method.
     * If it's null, test will fail.
     * Else, test will pass.
     */

    @Test
    public void checkPlayerNameNull() {
        String name = "Brax";
        m_LeaderboardEntry.setM_PlayerName(name);
        assertNotEquals(m_LeaderboardEntry.getM_PlayerName(),null);
    }

    /**
     * checkPlayerNameValidity() checks if m_LeaderboardEntry's
     * playerName is equal to name(Brax)
     * after it has been set using setM_playerName() method.
     * If it's equal, test will pass.
     * Else, test will fail.
     */

    @Test
    public void checkPlayerNameValidity() {
        String name = "Brax";
        m_LeaderboardEntry.setM_PlayerName(name);
        assertEquals(name,m_LeaderboardEntry.getM_PlayerName());
    }

    /**
     * checkScoreNull() checks if m_LeaderboardEntry's
     * score is equal to null
     * after it has been set using setM_score() method.
     * If it's null, test will fail.
     * Else, test will pass.
     */

    @Test
    public void checkScoreNull() {
        int score = 10;
        m_LeaderboardEntry.setM_Score(score);
        assertNotEquals(m_LeaderboardEntry.getM_Score(), (Integer) null);
    }

    /**
     * checkScoreValidity() checks if m_LeaderboardEntry's
     * score is equal to score(10)
     * after it has been set using setM_score() method.
     * If it's equal, test will pass.
     * Else, test will fail.
     */

    @Test
    public void checkScoreValidity() {
        int score = 10;
        m_LeaderboardEntry.setM_Score(score);
        assertEquals(score,m_LeaderboardEntry.getM_Score());
    }
}