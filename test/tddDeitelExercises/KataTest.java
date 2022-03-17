package tddDeitelExercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {

    @Test
    public void addTest() {
        Kata calculator = new Kata();
        int result = calculator.add(4, 3);
        assertEquals(5, result);
    }

    @Test
    public void subtractTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }

    @Test
    public void utmeTest() {
        Kata calculator = new Kata();
        int result = calculator.testDriller(5);
        assertEquals(9000, result);

    }

    @Test
    public void quotientTest() {
        Kata calculator = new Kata();
        int result = calculator.quotient(0, 3);
        assertEquals(0, result);
    }

    @Test
    public void countEVenTest(){
        Kata calculator = new Kata();
        int number = 2;
        while (number <= 100) {
        System.out.print(number + " ");
        number = number + 2;
        }
    }
    @Test
    public void EVentest(){
        Kata calculator = new Kata();
//        int number = 1;
//        while (number >= 2) {
//            calculator.isEven(1999);
//            number = number + 1;
//        }
        assertTrue(calculator.isEven(1998));
    }
//    the function takes in five integers and returns the biggest of the integer


    @Test
    public void test() {
        Kata calculator = new Kata();
        assertEquals(10, calculator.maximumNumber(10,8,7,6,5));
    }

//    @Test
//    public void MaximumNumberTest(){
//        Kata calculator = new Kata();
//        assertEquals(10, calculator.maxiNumber(1,2,3,4,5));
//    }

    @Test
    public void factorTest() {
        Kata calculator = new Kata();
        assertEquals(3, calculator.factor(49));
    }

    @Test
    public void primeNumberTest(){
        Kata calculator = new Kata();
        assertTrue(calculator.primeNumber(29));
        }

    }
//    write a function that takes in number type int

//    Write a function that takes an integer and returns true if the number is a prime number


/* @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }
}//*


    /* @Test
    public void calculateAreaTest(){
        Kata circle = new Kata();
        double result = circle.findAreaWith(radius:7);
        assertEquals(154.0, result);
    }
    
    @Test
    public void bitFLipperTest(){
        Kata flipper = new Kata();
        int result = flipper.flip(bit: 0);
        assertEquals (1, result);
        result = flipper.flip(bit: 1);
        assertEquals(0, result);

         @Test
//    public Void PalindromeTest(){
//        //given
//        Kata cata = new Kata();
//        //when
//        //System.out.print(int, int, int, int, int);
//        cata.palindrome(12345);
//        //Boolean result = palindrome.result(true);
//        //assertEquals(false, palindrome.);
//        Boolean result = cata.result();
//        assertEquals(true, result);
//
//    }
 */
 //
        
        
//