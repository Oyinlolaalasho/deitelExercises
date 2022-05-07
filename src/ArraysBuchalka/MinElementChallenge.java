package ArraysBuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = input.nextInt();
        input.nextLine();

        int[] returnedArray = readInteger(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min = " + returnedMin);
        System.out.println(Arrays.toString(returnedArray));

    }

    public static int[] readInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            input.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int value : array) {

            if (value < min) {
                min = value;

            }
        }
        return min;
    }
}

