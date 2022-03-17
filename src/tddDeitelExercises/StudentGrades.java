package tddDeitelExercises;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 1; i < 6; i++) {
            System.out.printf("Enter Student%d grade: ", i);
            String grade = input.nextLine();

            switch (grade) {
                case "A" -> a++;
                case "B" -> b++;
                case "C" -> c++;
                case "D" -> d++;
                default -> System.out.println("Unexpected value: " + grade);
            }
        }
        System.out.printf("A = %d, B = %d, C =%d, D = %d", a, b, c, d);

        }

    }

