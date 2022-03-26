package tddDeitelExercises;

import java.util.Random;
import java.util.Scanner;

public class RandomOperations {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random num = new Random();

        double correct = 0;
        double expected;

        int right = 0;
        int wrong = 0;
        for (int i = 1; i <= 10; i++) {
            int number = num.nextInt(0, 4);

            int int1 = num.nextInt(1, 100);
            int int2 = num.nextInt(1, 100);


            String operand = "";
            switch (number) {
                case 0 -> {
                    correct = int1 + int2;
                    operand = "+";
                }
                case 1 -> {
                    operand = "-";
                    if (int1 > int2) {
                        correct = int1 - int2;
                    } else {
                        correct = int2 - int1;
                    }
                }
                case 2 -> {
                    operand = "*";
                    correct = int1 * int2;
                }
                case 3 -> {
                    operand = "/";
                    correct = (double) int1 / int2;
                }
            }

            System.out.printf("is: %d  %s  %d = ", int1, operand, int2);
            expected = input.nextInt();

            if (expected == correct) {
                System.out.println("Correct");
                right++;
            } else {
                System.out.println("Wrong");
                wrong++;
            }
            System.out.printf("Right = %d \t wrong = % d \n Total = %d", right, wrong, (right - wrong));
        }
    }
}

