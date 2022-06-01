package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private MyStack stack;

    @BeforeEach
    void setUp() {
        stack = new MyStack();
    }

    @Test
    public void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    public void stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneElement_stackIsNotEmptyTest() {
        stack.push(13);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popX_stackShouldBeEmptyTest() {
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXY_popX_stackShouldNotBeEmptyTest() {
        stack.push(13);
        stack.push(13);
        stack.pop();
        assertFalse(stack.isEmpty());

    }

    @Test
    public void pushXY_popXY_stackShouldBeEmptyTest() {
        stack.push(13);
        stack.push(13);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushX_popX_elementShouldBeX() {
        stack.push(13);
        assertEquals(13, stack.pop());
    }

    @Test
    public void pushXY_popYandX_elementIsYThenXTest() {
        stack.push(34);
        stack.push(67);
        int element = stack.pop();
        assertEquals(67, element);
        element = stack.pop();
        assertEquals(34, element);

    }

    @Test
    public void pushXandY_peekReturnsYTest() {
        stack.push(34);
        stack.push(67);
        int element = stack.peek();
        assertEquals(67, element);
        element = stack.pop();
        assertEquals(67, element);
        element = stack.peek();
        assertEquals(34, element);

    }
}