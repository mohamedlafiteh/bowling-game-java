package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class BowlingTest {
    /**
     * Rigorous Test :-)
     */
    BowlingGame bowlingGame;

    @Before
    public void starter() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void InputTest() {
        int [] l = {1,4,4,5,6,4,5,5,10,0,1,7,3,6,4,10,2,8,6};
        assertEquals(5, bowlingGame.getScore(l)[0]);
    }
    @Test
    public void  OutputTest() {
        int [] l = {1,4,4,5,6,4,5,5,10,0,1,7,3,6,4,10,2,8,6};
        String out =  "[5, 14, 29, 49, 60, 61, 77, 97, 117, 133]";
        String returnedOutPut = Arrays.toString(bowlingGame.getScore(l));
        assertEquals(out, returnedOutPut);
    }


}
