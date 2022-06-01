package TicTacToe;

import static TicTacToe.Elements.*;

public class Board {
    Elements[][] position = new Elements[3][3];

    public Board() {
        for (int row = 0; row < position.length ; row++) {
            for (int column = 0; column < position[row].length; column++) {
                position[row][column] = E;
            }
        }

    }

    public void setPlayAt(int row, int column, Elements playersTurn) {
        position[row][column] = playersTurn;
    }

    @Override
    public String toString() {
        return position[0][0] + " | " +  position[0][1] + " | "  + position[0][2] + "  " + "\n" +
                "--" + "+" + "--" +"+"+"--"+" \n"+
                position[1][0] + " | "  + position[1][1] + " | " + position[1][2] + "  " + "\n" +
                "--" + "+" + "--" +"+"+"--"+" \n"+
                position[2][0] + " | " + position[2][1] + " | " + position[2][2] + "  " + "\n";

    }

    public Elements getPosition(int row, int column) {
        return position[row][column];
    }
}
