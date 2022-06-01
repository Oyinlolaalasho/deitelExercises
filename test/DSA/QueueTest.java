package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
	private MyQueue queue;
	@BeforeEach
	public void setUp(){
		queue = new MyQueue();
	}
	@Test
	public void testQueue() {
		assertNotNull(queue);
	}

	@Test
	public void isEmptyTest() {
		assertTrue(queue.isEmpty());
	}

	@Test
	public void queueCanAddElementTest() {
		queue.push("2");
		assertFalse(queue.isEmpty());
		assertFalse(queue.isNotEmpty());
	}

	@Test
	public void queueCanAddMoreElementTest() {
		queue.push("2");
		queue.push("3");
		queue.push("4");
		queue.push("5");
		assertFalse(queue.isEmpty());
		assertFalse(queue.isNotEmpty());
		assertEquals(4, queue.size());
	}

	@Test
	public void queueCanPeekFirstElementTest() {
		queue.push("2");
		queue.push("3");
		queue.push("4");
		queue.push("5");
		queue.peek();
		assertEquals("2", queue.peek());
	}

	@Test
	public void queueCanPopFirstElementTest() {
		queue.push("2");
		queue.push("3");
		queue.push("4");
		queue.push("5");
		assertEquals(4, queue.size());
		assertEquals("2", queue.peek());
		queue.pop();
		assertEquals("3", queue.peek());
		assertEquals(3, queue.size());
	}

}
