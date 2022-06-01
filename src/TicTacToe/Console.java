package TicTacToe;

import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);
    TicTacToe ticTacToe = new TicTacToe();
    public void play() {
        int userResponse = promptUser();

        switch(userResponse) {
            case 1: ticTacToe.playAt(0,0);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;

            case 2: ticTacToe.playAt(0,1);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;


            case 3: ticTacToe.playAt(0,2);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;

            case 4: ticTacToe.playAt(1,0);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;


            case 5: ticTacToe.playAt(1,1);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;


            case 6: ticTacToe.playAt(1,2);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;


            case 7: ticTacToe.playAt(2,0);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;


            case 8: ticTacToe.playAt(2,1);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;


            case 9: ticTacToe.playAt(2,2);
            if (playerWIns()) break;
            if (draw()) break;
            play();
            break;

        }

    }
    private void print(String input) {
        System.out.println(input);
    }

    private int input(String text) {
        print(text);
        return scanner.nextInt();
    }

    private int promptUser() {
         print("Enter any digit within 1-9 to play");
         print(ticTacToe.displayBoard());
         return input(ticTacToe.currentPlayer());
    }

    private boolean draw() {
        if (ticTacToe.isDraw()) {
            print("Game is a Draw");
            print(ticTacToe.displayBoard());
            return true;
        }
    return false;
    }

    private boolean playerWIns() {
        if (ticTacToe.isPlayerOneWon()) {
            print("Player 1 won");
            print(ticTacToe.displayBoard());
            return true;
        }
        else if (ticTacToe.isPlayerTwoWon()) {
            print("Player 2 won");
            print(ticTacToe.displayBoard());
            return true;
        }
        return false;
    }
}
