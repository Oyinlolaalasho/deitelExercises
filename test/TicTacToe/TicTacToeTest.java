package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToe.Elements.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe ticTacToe;


    @BeforeEach
    public void setup() {
        ticTacToe = new TicTacToe();
    }
    @Test
    public void ticTacToeCanBeCreatedTest(){
        assertNotNull(ticTacToe);
    }

//    @Test
//    public void boardIsEmptyTest() {
//        board.isEmpty();
//        assertTrue(board.isEmpty());
//    }

//    @Test
//    public void playerCanBeCreated() {
//        ticTacToe.player1Move();
//        assertTrue(board.isEmpty());
//        assertEquals(Elements.X, board.toString());
//
//    }

    @Test
    public void boardIsEmptyByDefaultTest() {
        assertEquals(E, ticTacToe.position(0,2));
    }

//    @Test
//    public void boardIsEmptyTest() {
//        board.isEmpty();
//        assertTrue(board.isEmpty());
//    }

     @Test
    public void firstPlayerIsXTest() {
        ticTacToe.playAt(0,0);
        assertEquals(X, ticTacToe.position(0,0));
     }

     @Test
    public void secondPLayerMoveIsOTest() {
        ticTacToe.playAt(0,0);
        ticTacToe.playAt(0,1);
         assertEquals(O, ticTacToe.position(0,1));
     }

     @Test
    public void moveCannotBeOverriddenTest() {
        ticTacToe.playAt(0,0);
        ticTacToe.playAt(0,0);
        assertEquals(X, ticTacToe.position(0,0));
     }


}
