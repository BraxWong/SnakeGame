package com.Brax.Testing;

import com.Brax.View.View_MyFrame;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class View_MyFrameTest {
    View_MyFrame frame = new View_MyFrame();

    /**
     * checkFramePropertiesValue() makes sure the JFrame is
     * not null.
     */
    @Test
    public void checkFramePropertiesValue() {
        assertNotEquals(frame.m_jFrame,null);
    }
}