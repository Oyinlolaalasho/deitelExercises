package Abstractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayLIstTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void addTest() {
        List list = new ArrayLIst();
        list.add("Boxers for boyfriend");
        assertEquals(1, list.size());
    }

    @Test
    void testAdd() {
    }

    @Test
    void get() {
    }

    @Test
    void remove() {

    }

    @Test
    public void addAndGetTest(){
            List list = new ArrayLIst();
            list.add("Boxer for boyfriend");
            assertEquals("Boxer for boyfriend", list.get(0));
    }

    @Test
    void testRemove() {
        List list = new ArrayLIst();
        list.add("String on a guitar");
        list.add("Fish as a meal");
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    void size() {

    }
}