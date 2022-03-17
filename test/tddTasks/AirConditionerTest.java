package tddTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {

    AirConditioner lg;
    @BeforeEach
    public void startWith(){
    lg = new AirConditioner();
    }

    @Test
    public void powerOffTest(){
        lg.isOn();
        assertFalse(lg.isOn());
        }

    @Test
    public void powerOnTest(){
        lg.isOn();
        lg.isOn();
        assertTrue(lg.isOn());
        }

    @Test
    public void coolerTest(){
        lg.isOn();
        lg.cooler();
        assertEquals(17, lg.getTemperature());
    }

    @DisplayName("cooler limit test")
    @Test
    public void coolerLimitTest(){
        lg.isOn();
        lg.isOn();
        int num = 1;
        while (num < 15) {
            lg.cooler();
            num = num + 1;
        }
        assertEquals(30, lg.getTemperature());
    }

    @DisplayName("heater test")
    @Test
    public void heaterTest(){
        lg.isOn();
//        lg.isOn();
        int num = 1;
        while (num < 6) {
            lg.cooler();
            num = num + 1;
        }
        lg.heater();
        lg.heater();
        assertEquals(19, lg.getTemperature());
    }

    @DisplayName("heater limit test")
    @Test
    public void test(){
        lg.isOn();
        int num = 1;
        while (num <2) {
            lg.cooler();
            num = num + 1;
        }
        lg.heater();
        lg.heater();
        assertEquals(16, lg.getTemperature());
    }

}
