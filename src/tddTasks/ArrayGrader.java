package tddTasks;

import java.util.Scanner;

public class ArrayGrader {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in this class");
        int students = input.nextInt();
        System.out.println("How many subjects do they offer in this class");
        int subjects = input.nextInt();
        int[][] arrayGrader = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.println("Enter grade for student: " + i);
                arrayGrader[i][j] = input.nextInt();
            }
            System.out.println();
        }
        int averageStudentGrade = 0;
        for (int i = 0; i < students; i++) {
            int studentGrade = 0;
            for (int j = 0; j < subjects; j++) {
                studentGrade += arrayGrader[i][j];
                averageStudentGrade = studentGrade / arrayGrader[i].length;
                System.out.print(arrayGrader[i][j] + " ");
            }
            System.out.print(studentGrade + " ");
            System.out.println(averageStudentGrade + " ");
            averageStudentGrade = 0;
        }
        System.out.println();
    }
}

