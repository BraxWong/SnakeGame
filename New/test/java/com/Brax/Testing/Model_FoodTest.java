package com.Brax.Testing;

import com.Brax.Model.Model_Food;
import com.Brax.Model.Model_MySnake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Model_FoodTest {
    private Model_Food m_Food = new Model_Food();

    /**
     * checkEatenExe() will check whether eaten() within
     * Model_Food is being executed correctly.
     * True if executed successfully,
     * false if not.
     */
    @Test
    public void checkEatenExe() {
        Model_MySnake mySnake = new Model_MySnake(100,100);
        Boolean check = m_Food.eaten(mySnake);
        assertEquals(check,true);
    }
}