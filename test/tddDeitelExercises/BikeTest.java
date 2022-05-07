package tddDeitelExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    private Bike bajaj;
    @BeforeEach
    public void setUp() {
        bajaj = new Bike();
    }

    @Test
    public void bikeSwitchTest() {
        //given
        //when
        bajaj.power("off");
        Boolean mode = bajaj.mode();
        //assert
        assertEquals(false, mode);
    }

    @Test
    //given
    public void onBikeSwitchTest() {
        //when
        bajaj.power("off");
        Boolean mode = bajaj.mode();
        assertEquals(false, mode);
        bajaj.power("on");
        mode = bajaj.mode();
        //assert
        assertEquals(true, mode);
    }

    @Test
    //given
    public void acceleration1Test() {
        //when
        bajaj.acceleration();
        int speed = bajaj.speed();
        //assert
        assertEquals(1, speed);

    }

    @Test
    //given
    public void acceleration2Test() {

        //when
        bajaj.power("on");
        Boolean mode = bajaj.mode();
        assertEquals(true, mode);
        //bajaj.setSpeed(30);
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
//      when
        bajaj.acceleration();
        bajaj.acceleration();
        int speed = bajaj.speed();

        //assert
        assertEquals(24, speed);
    }

    @Test
    //given
    public void acceleration3Test() {

        //when
        bajaj.power("on");
        Boolean mode = bajaj.mode();
        assertEquals(true, mode);
        //
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration(); //20 speed
//when
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration();
        bajaj.acceleration(); //30 speed
        int speed = bajaj.speed();
//assert
        assertEquals(30, speed);
    }


    @Test
    public void decelerationTest() {
        //given

        //when
        bajaj.power("on");
        Boolean mode = bajaj.mode();
        assertEquals(true, mode);
        bajaj.setSpeed(20);
        bajaj.deceleration();
        int speed = bajaj.speed();
        //assert
        assertEquals(19, speed);
    }

    @Test
    public void accelerateTest() {

//        bajaj.isOn();
        int num = 1;
        while (num < 5) {
            bajaj.accelerate();
            num = num + 1;
            //System.out.println(num);
            bajaj.accelerate();
        }
//        assertEquals(1, bajaj.getSpeed());
    }
}



