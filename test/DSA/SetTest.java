package DSA;

import DSA.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
	private MySet set;

	@BeforeEach
	public void setUp(){
		set = new MySet();
	}
	@Test
	public void setExistTest() {
		MySet set = new MySet();
		assertNotNull(set);
	}

	@Test
	public void setIsEmptyTest() {
		assertEquals(0, set.size());
	}

	@Test
	public void setCanAddElementTest() {
		set.add("2");
		assertEquals(1, set.size());
	}

	@Test
	public void setCanAddMoreElementTest() {
		set.add("2");
		set.add("4");
		set.add("3");
		set.add("5");
		assertEquals(4, set.size());
	}

	@Test
	public void setCanHaveUniqueElementTest() {
		set.add("2");
		set.add("4");
		set.add("2");
		set.add("5");
		assertEquals(3, set.size());
	}

	@Test
	public void setCanRemoveElementTest() {
		set.add("2");
		set.add("4");
		set.add("3");
		set.add("5");
		assertTrue(set.contains("3"));
		set.remove("3");
		assertFalse(set.contains("3"));
		assertEquals(3, set.size());
		assertEquals(5, set.get(2));
	}

	@Test
	public void setCanRemoveAllElementTest() {
		set.add("2");
		set.add("4");
		set.add("3");
		set.add("5");
		set.removeAll();
		assertEquals(0, set.size());
	}
}
