package tddDeitelExercises;

import java.util.Scanner;

public class TrianglePrinter<num> {

//    static void printTrianglesJava13(int triangles, int size) {
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < triangles; j++) {
//                String line = switch(j % 4) {
//                    case 0 -> pattern("*", i + 1, " ", size - i);
//                    case 1 -> pattern("*", size - i, " ", i + 1);
//                    case 2 -> pattern(" ", i + 1, "*", size - i);
//                    case 3 -> pattern(" ", size - i, "*", i + 1);
//                    default -> "";
//                };
//                System.out.print(line);
//            }
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {

        int num = 10;
        int i = 1;
        int k = 1;
        int j = 1;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (j = i; j <= num; j++) {
                System.out.print("* ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
                for (j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
            for (j = i; j <= num; j++) {
                System.out.print("* ");
            }
            for (j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

                System.out.println();
            }

            Scanner input = new Scanner(System.in);

            System.out.println("input the integer");
            int multiplier = input.nextInt();
            multiplier = 12;
            for (i = 1; i <= multiplier; i++) {
                int result = i * multiplier;
                System.out.printf("%d * %d = %d\n", i, multiplier, result);

            }
            System.out.println();
        }
    }







//        for (int i = num; i <= num; i++) {
//
//            for (int j = i; j <= num; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j <= num; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//            int j;
//            for (j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            for (int k = j; k < num; k++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }
//        for (int i = 0; i <= num; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = num; i >= 0; i--) {
//            int j = 0;
//            for (j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int k = j; k < num; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//        for (int i = 0; i <= num; i++) {
//            int j;
//            for (j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int k = j; k < num; k++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();