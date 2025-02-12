package com.precious_stones;


import com.precious_stones.implementation.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PreciousStoneTest {

    @Test
    public void testPreciousStone() {
        assertThrows(IllegalArgumentException.class, () -> new Diamond(101, 500, 0.5));
        assertThrows(IllegalArgumentException.class, () -> new Ruby(-10, 500, 0.5));
        assertDoesNotThrow(() -> new Ruby(10, 500, 0.5));

    }

    @Test
    public void testGetValueMethods() {
        PreciousStone ruby = new Ruby(100, 1000, 0.4);
        assertEquals(3000, ruby.getValue());

        PreciousStone sapphire = new Sapphire(50, 1000, 0.4);
        assertEquals(600, sapphire.getValue());

        PreciousStone emerald = new Emerald(80, 1000, 0.4);
        assertEquals(600, emerald.getValue());

        PreciousStone diamond = new Diamond(90, 1000, 0.4);
        assertEquals(900, diamond.getValue());
    }

    @Test
    public void testToStringFormat() {
        PreciousStone ruby = new Ruby(80, 750, 0.25);
        assertEquals("Ruby(80% 750,00$ 0,25CD)", ruby.toString());
    }
}

