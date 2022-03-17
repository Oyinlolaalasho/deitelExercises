package tddDeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    @Test
    void userCanFindSum(){
        Arithmetic arithmetic = new Arithmetic();

        assertEquals(50,arithmetic.findSumOfThreeIntegers(10,20,20));
    }

    @Test
    void userCanFindAverage(){
        Arithmetic arithmetic = new Arithmetic();
        assertEquals(10, arithmetic.findAverageOf(10,10,10));
    }
}
