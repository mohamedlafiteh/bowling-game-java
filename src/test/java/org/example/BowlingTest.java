package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BowlingTest

{
    /**
     * Rigorous Test :-)
     */
    BowlingGame bowlingGame;
    @Before
    public void starter()
    {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void rollsTest()
    {
        bowlingGame = new BowlingGame();
            roller(0,20);
        assertEquals(0,bowlingGame.getScore());
    }

    @Test
    public void rollAllTest()
    {
         bowlingGame = new BowlingGame();
            roller(1,20);
        assertEquals(20,bowlingGame.getScore());
    }

    @Test
    public void spareTest()
    {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        roller(0,17);
        assertEquals(16,bowlingGame.getScore());
    }
    @Test
    public void strikeTest()
    {
        bowlingGame.roll(10);
        bowlingGame.roll(4);
        bowlingGame.roll(3);
        roller(0,16);
        assertEquals(24,bowlingGame.getScore());
    }
    public void roller( int pins, int rolls)
    {
        for (int i = 0; i <rolls ; i++) {
            bowlingGame.roll(pins);
        }
    }
}
