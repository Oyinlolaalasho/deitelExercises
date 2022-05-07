package tddDeitelExercises;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperation {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];
        int maximum = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = random.nextInt(1, 50);
            if (numbers[i] > maximum) maximum = numbers[i];
            sum += numbers[i];
        }
        System.out.print(Arrays.toString(numbers) + " ");
        System.out.println();
        System.out.println(maximum);
        System.out.println(sum);
        System.out.println(sum/ numbers.length);
    }


}
