package Practice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentReportPracticeTest {

    @Test
    public void testForStudentScoreSum() {
        int[][] grades = {{90, 20, 40}, {40, 40, 20}};
        StudentReport report = new StudentReport(grades);
        int result = report.getStudentScoreSum(0);
        assertEquals(150, result);
        result = report.getStudentScoreSum(1);
        assertEquals(100, result);
    }

    @Test
   public void testForStudentScoreAverage() {
        int[][] grades = {{30, 30, 30}, {20, 20, 20}};
        StudentReport report = new StudentReport(grades);
        int average = report.getStudentScoreAverage(0);
        assertEquals(30, average);
        average = report.getStudentScoreAverage(1);
        assertEquals(20, average);

    }

}
