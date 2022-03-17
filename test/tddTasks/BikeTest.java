package tddTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BikeTest {

    Bike bike;

    @BeforeEach
    public void startWith() {
        bike = new Bike();
    }

    @Test
    public void powerOffTest() {
        bike.isOn();
        assertFalse(bike.isOn());
    }

    @Test
    public void powerOnTest() {
        bike.isOn();
        bike.isOn();
        assertTrue(bike.isOn());
    }

    @Test
    @DisplayName("i can increase speed by 1")
    public void accelerateTest() {
        bike.isOn();
        int num = 0;

        while (num < 20) {
            bike.accelerate();
            num += 1;
        }
        assertEquals(20, bike.getSpeed());
    }

    @Test
    @DisplayName("i can decrease speed by 1")
    public void test() {
        bike.isOn();
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            bike.decelerate();
        }
        assertEquals(19, bike.getSpeed());
    }
}
