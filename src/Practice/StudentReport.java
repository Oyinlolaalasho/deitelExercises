package Practice;

public class StudentReport {

    private final int[][] grades;

    public StudentReport(int[][] grades) {
        this.grades = grades;
    }

    public int getStudentScoreSum(int indexNumber) {
        int result = 0;
        for (int i = 0; i < grades[indexNumber].length; i++) {
            result += grades[indexNumber][i];
        }
        return result;
    }

    public int getStudentScoreAverage(int indexNumber) {
        return getStudentScoreSum(indexNumber) / grades[indexNumber].length;
        }

    }

