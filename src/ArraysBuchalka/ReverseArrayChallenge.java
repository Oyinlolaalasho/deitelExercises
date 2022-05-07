package ArraysBuchalka;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40};
            reverse(arr, arr.length);


        }

    public static void reverse(int[] array, int index) {
            int[] reversed = new int[index];
            int element = index;

            for (int i = 0; i < index; i++) {

                reversed[element - 1] = array[i];
                    element -= 1;

            }
            print("Reversed array is: " + Arrays.toString(reversed));
            print("Original array is: " + Arrays.toString(array));
            for (int i = 0; i < index; i++) {
                print(String.valueOf(reversed[i]));

            }
        }
        public static void print(String str) {
           System.out.println(str);
        }

    }
