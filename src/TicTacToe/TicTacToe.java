package TicTacToe;

import static TicTacToe.Elements.*;

public class TicTacToe {

    Board board = new Board();
    private int move;
    private boolean playerOneWon;
    private boolean playerTwoWon;

    public Elements position(int row, int column) {
        return board.getPosition(row, column);
    }

    public void playAt(int row, int column) {
        if(board.getPosition(row, column) == E) {
            board.setPlayAt(row,column, playersTurn());
            move++;
        }
    }

    public Elements playersTurn(){
        if (move % 2 == 0 ) return X;
        if (move % 2 == 1 ) return O;
        return E;
    }

    public String displayBoard(){
        return board.toString();
    }

    public boolean isFirstPlayer() {
        return move % 2 == 0;
    }

    public String currentPlayer() {
        if (isFirstPlayer()) return "Player1 (X's Turn)";
        return "Player2 (O's Turn)";
    }

    public boolean isDraw() {
        return move == 9;
    }
    public void win() {
    winOne();
    winTwo();
    winThree();
    winFour();
    winFive();
    winSix();
    winSeven();
    winEight();
    }

    public boolean isPlayerOneWon() {
        win();
        return playerOneWon;
    }

    public boolean isPlayerTwoWon() {
        win();
        return playerTwoWon;
    }

    private void winOne() {
        if (board.position[0][0] == X && board.position[0][1] == X && board.position[0][2] == X) playerOneWon = true;
        if (board.position[0][0] == O && board.position[0][1] == O && board.position[0][2] == O) playerTwoWon = true;
    }
    private void winTwo() {
        if (board.position[1][0] == X && board.position[1][1] == X && board.position[2][2] == X) playerOneWon = true;
        if (board.position[1][0] == O && board.position[1][1] == O && board.position[2][2] == O) playerTwoWon = true;
    }
    private void winThree() {
        if (board.position[2][0] == X && board.position[2][1] == X && board.position[2][2] == X) playerOneWon = true;
        if (board.position[2][0] == O && board.position[2][1] == O && board.position[2][2] == O) playerTwoWon = true;
    }
    private void winFour() {
        if (board.position[0][0] == X && board.position[1][0] == X && board.position[2][0] == X) playerOneWon = true;
        if (board.position[0][0] == O && board.position[1][0] == O && board.position[2][0] == O) playerTwoWon = true;
    }
    private void winFive() {
        if (board.position[0][1] == X && board.position[1][1] == X && board.position[2][1] == X) playerOneWon = true;
        if (board.position[0][1] == O && board.position[1][1] == O && board.position[2][1] == O) playerTwoWon = true;
    }
    private void winSix() {
        if (board.position[0][2] == X && board.position[1][2] == X && board.position[2][2] == X) playerOneWon = true;
        if (board.position[0][2] == O && board.position[1][2] == O && board.position[2][2] == O) playerTwoWon = true;
    }
    private void winSeven() {
        if (board.position[0][0] == X && board.position[1][1] == X && board.position[2][2] == X) playerOneWon = true;
        if (board.position[0][0] == O && board.position[1][1] == O && board.position[2][2] == O) playerTwoWon = true;
    }
    private void winEight() {
        if (board.position[0][2] == X && board.position[1][1] == X && board.position[2][0] == X) playerOneWon = true;
        if (board.position[0][2] == O && board.position[1][1] == O && board.position[2][0] == O) playerTwoWon = true;
    }
}
