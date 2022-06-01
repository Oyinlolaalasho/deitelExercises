package DSA;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {


	private Stack stack;

	@BeforeEach
	public void setUp() {
		stack = new Stack();
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
	public void pushOneElement_stackIsNotEmptyTest(){
		stack.push(13);
		assertFalse(stack.isEmpty());
	}

	@Test
	public void pushX_popX_stackIsEmptyTest() {
		stack.push(13);
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void pushXY_popX_stackIsNotEmptyTest() {
		stack.push(13);
		stack.push(14);
		stack.pop();
		assertFalse(stack.isEmpty());
	}

	@Test
	public void pushXY_stackIsNotEmptyTest() {
		stack.push(13);
		stack.push(14);
		assertFalse(stack.isEmpty());
	}

	@Test
	public void pushXY_popXY_stackIsEmptyTest() {
		stack.push(13);
		stack.push(14);
		stack.pop();
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void pushX_popX_elementShouldBeXTest() {
		stack.push(13);
		int element = stack.pop();
		assertEquals(13,element);
	}

	@Test
	public void pushXY_popXY_elementShouldBeXYTest() {
		stack.push(13);
		stack.push(14);
		int element = stack.pop();
		assertEquals(14,element);
		element = stack.pop();
		assertEquals(13,element);
	}

	@Test
	public void pushXY_peekReturnsYTest() {
		stack.push(13);
		stack.push(14);
		int element = stack.peek();
		assertEquals(14,element);
		element = stack.pop();
		assertEquals(14,element);
		element = stack.peek();
		assertEquals(13,element);
	}
}
