package tddTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CrapsTest {

    static Craps crapsGame;
    @BeforeEach
    public void atEach(){ crapsGame = new Craps(); }

    @Test
    public void NotPlayingCrap() {
        crapsGame.isPlaying();
        assertFalse(crapsGame.isPlaying());
    }
    @Test
    public void playingCrap() {
        crapsGame.isPlaying();
        crapsGame.isPlaying();
        assertTrue(crapsGame.isPlaying());
    }

    @Test
    public void sumOfFirstRollIsSeven() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(5, 2);
        assertEquals("You Win", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsEleven() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(5,6);
        assertEquals("You Win", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsTwo() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(1, 1);
        assertEquals("You Lose", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsThree() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(2, 1);
        assertEquals("You Lose", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsTwelve() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(6, 6);
        assertEquals("You Lose", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsFour() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(2, 2);
        assertEquals("Continue", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsFive() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(3, 2);
        assertEquals("Continue", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsSix() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(3, 3);
        assertEquals("Continue", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsEight() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(6, 2);
        assertEquals("Continue", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsNine() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(4, 5);
        assertEquals("Continue", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfFirstRollIsTen() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(5, 5);
        assertEquals("Continue", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfNewRollEqualsFirstRoll() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(3, 3);
        crapsGame.newRoll(3,3);
        assertEquals("You Win", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfNewRollIsSeven() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(2, 2);
        crapsGame.newRoll(5,2);
        assertEquals("You Lose", crapsGame.getNewRollStatus());
    }
    @Test
    public void sumOfNewRollIsEleven() {
        crapsGame.isPlaying();
        crapsGame.firstRoll(2, 2);
        crapsGame.newRoll(5,6);
        assertEquals("You Lose", crapsGame.getNewRollStatus());
    }
}

