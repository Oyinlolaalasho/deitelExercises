package tddDeitelExercises;

import java.util.Scanner;

public class PrintProgramTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input the first digit");
        int num1 = input.nextInt();

        System.out.println("input the second digit");
        int num2 = input.nextInt();

        System.out.println("input the third digit");
        int num3 = input.nextInt();

        System.out.println("input the fourth digit");
        int num4 = input.nextInt();

        System.out.println("input the fifth digit");
        int num5 = input.nextInt();


        for (int i = 0; i < num1; i++) {
            if (num1 <= 30)
                System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num2; i++) {
            if (num2 <= 30)
                System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num3; i++) {
            if (num3 <= 30)
                System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num4; i++) {
            if (num4 <= 30)
                System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < num5; i++) {
            if (num5 <= 30)
                System.out.print("* ");
        }

    }
}