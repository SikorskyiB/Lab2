package com.necklace;

import com.precious_stones.PreciousStone;
import com.precious_stones.implementation.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NecklaceTest {

    private Necklace necklace;

    @BeforeEach
    public void setUp() {
        necklace = new Necklace();
        necklace.addStone(new Diamond(90, 1000, 0.5));
        necklace.addStone(new Ruby(80, 800, 0.3));
        necklace.addStone(new Emerald(70, 700, 0.4));
        necklace.addStone(new Sapphire(85, 600, 0.25));
    }

    @Test
    public void testGetWeight() {
        assertEquals(1.45, necklace.getWeight(), 0.0001);
    }

    @Test
    public void testGetPrice() {
        assertEquals(3100, necklace.getPrice(), 0.0001);
    }

    @Test
    public void testSortByValue() {
        necklace.sortByValue();
        List<PreciousStone> stones = necklace.stones;

        for (int i = 0; i < stones.size() - 1; i++) {
            assertTrue(stones.get(i).getValue() <= stones.get(i + 1).getValue());
        }
    }

    @Test
    public void testFindInTransparencyRange() {
        List<PreciousStone> result = necklace.findInTransparencyRange(75, 90);
        assertEquals(2, result.size());
    }

    @Test
    public void testToString() {
        assertEquals("[Diamond(90% 1000,00$ 0,50CD), Ruby(80% 800,00$ 0,30CD), Emerald(70% 700,00$ 0,40CD), Sapphire(85% 600,00$ 0,25CD)]", necklace.toString());
    }
}
