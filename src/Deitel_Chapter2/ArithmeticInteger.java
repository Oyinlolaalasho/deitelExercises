package Deitel_Chapter2;//2.15ArithmeticInteger

import java.util.Scanner;

public class ArithmeticInteger{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int x = input.nextInt();

    System.out.print("Enter second integer: ");
    int y = input.nextInt();

    int xSquare = x * x;
    int ySquare = y * y;
    int squareSum = xSquare + ySquare;
    int squareDiff = xSquare - ySquare;


    System.out.printf("First integer square is: %d\nThe second integer square is: %d\nThe sum of the square is: %d\nThe square difference is: %d\n", xSquare, ySquare, squareSum, squareDiff);
    }
}
