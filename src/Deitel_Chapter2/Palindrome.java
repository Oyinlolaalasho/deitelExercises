package Deitel_Chapter2;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        if (number1 == number2 && number2 == number3){
            System.out.printf("%d %d %d is a palindrome", number1, number2, number3);
        }
        if (number1 == number3 && number2 != number1){
            System.out.printf("%d %d %d is a palindrome", number1, number2, number3);
        }
        if (number1 != number3){
            System.out.printf("%d %d %d is a palindrome", number1, number2, number3);
        }
    }

}
