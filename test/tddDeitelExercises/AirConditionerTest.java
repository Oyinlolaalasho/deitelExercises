package tddDeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    //given
    public void powerIsOffTest(){
    AirConditioner powerHorse = new AirConditioner();
    //when
    powerHorse.power("off");
    Boolean mode = powerHorse.mode();
    //assert
    assertEquals(false, mode);
    }
    
    @Test
    //given
    public void powerIsOnTest() {
    AirConditioner powerHorse = new AirConditioner();
    //when
    powerHorse.power("off");
    Boolean mode = powerHorse.mode();
    assertEquals(false, mode);
    powerHorse.power("on");
    mode = powerHorse.mode();
//  assert
    assertEquals(true, mode);
    }

    @Test

    public void increaseTemperatureTest(){
    //given
        AirConditioner powerHorse = new AirConditioner();
    //when we try to increase temperature
        powerHorse.power("on");
        Boolean mode = powerHorse.mode();
        assertEquals(true, mode);
        //powerHorse.setTemperature(25);
//        powerHorse.getTemperature();
        powerHorse.increaseTemperature();
        int temperature = powerHorse.temperature();
        //assert
        assertEquals(17, temperature);
    }


    @Test
    //given
    public void decreaseTemperatureTest(){
        AirConditioner powerHorse = new AirConditioner();
        //when we try to decrease temperature
        powerHorse.power("on");
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        powerHorse.increaseTemperature();
        assertEquals(24, powerHorse.temperature());
        powerHorse.decreaseTemperature();

        int temperature = powerHorse.temperature();
        //assert
        assertEquals(23, temperature);

    }

    @Test
    //given
    public void beyondMaximumTempTest() {
        AirConditioner powerHorse = new AirConditioner();
        //when we try to increase above 30 degree temperature
        powerHorse.power("on");
        assertEquals(true, powerHorse.mode());
        powerHorse.setTemperature(400);
        powerHorse.increaseTemperature();
        int temperature = powerHorse.temperature();
        assertEquals(30,temperature);

    }

    @Test
    public void belowMinimumTempTest() {
        AirConditioner powerHorse = new AirConditioner();
        //when we try to decrease beyond 16 degree temperature
        powerHorse.power("on");
        assertEquals(true, powerHorse.mode());
        powerHorse.setTemperature(15);
        powerHorse.increaseTemperature();
        powerHorse.decreaseTemperature();
        int temperature = powerHorse.temperature();
        assertEquals(16, temperature);
    }
}
