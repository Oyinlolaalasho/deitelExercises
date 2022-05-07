package Deitel_Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {

    private Clock clock;
    @BeforeEach
    void setUp() {
        clock = new Clock(23, 59, 59);
    }

    @Test
    public void hourTest(){
        clock.setHour(-1);
        assertEquals(0, clock.getHour());
    }

    @Test
    public void minuteTest(){
        clock.setMinute(60);
        assertEquals(0, clock.getMinute());

    }
    @Test
    public void secondTest() {
        clock.setSeconds(60);
        assertEquals(0, clock.getSeconds());
    }
    @Test
    public void displayTimeTest(){
        clock.displayTime();
        assertEquals("23:59:59", clock.getDisplayTime());
    }
}
