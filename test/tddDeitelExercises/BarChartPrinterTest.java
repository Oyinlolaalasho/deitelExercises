package tddDeitelExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BarChartPrinterTest {

    BarChartPrinter barChart;
    @BeforeEach
    public void use(){
    barChart = new BarChartPrinter();
    }

    @Test
    public void barChartTest(){

        barChart.printer(12345);

        assertEquals(42, barChart.printer(42));
    }

}
