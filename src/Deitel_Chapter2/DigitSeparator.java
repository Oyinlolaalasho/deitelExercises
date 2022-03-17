// Exercise2.30

package Deitel_Chapter2;

import java.util.Scanner;

public class DigitSeparator {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("input a five digit integer");
        int num = input.nextInt();
        if ((num/10000) > 9) {
            System.out.println("digit must be equal to 5 and not negative");
        }

else {
            int num1 = (num / 10000);
            int num2 = (num % 10000) / 1000;
            int num3 = (num % 1000) / 100;
            int num4 = (num % 100) / 10;
            int num5 = (num % 10);

            System.out.printf("The separated digit is %d   %d   %d   %d   %d", num1, num2, num3, num4, num5);
        }

    }
}
