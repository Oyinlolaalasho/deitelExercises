package Deitel_Chapter2;//2.16ComparingIntegers

import java.util.Scanner;

public class ComparingIntegers{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Input an integer: ");
    int number1 = input.nextInt();


    int number2 = 100;

    int number3 = number1 * number1;


    if(number1 > number2)
      System.out.printf("%d > %d%n", number1, number2);

    if(number1 == number2)
      System.out.printf("%d == %d%n", number1, number2);

    if(number1 != number2)
      System.out.printf("%d != %d%n", number1, number2);

    if(number1 < number2)
      System.out.printf("%d < %d%n", number1, number2);

    if(number3 > number2)
      System.out.printf("%d > %d%n", number3, number2);

    if(number3 == number2)
      System.out.printf("%d == %d%n", number3, number2);

    if(number3 != number2)
      System.out.printf("%d != %d%n", number3, number2);

    if(number3 < number2)
      System.out.printf("%d < %d%n", number3, number2);

    }

}
