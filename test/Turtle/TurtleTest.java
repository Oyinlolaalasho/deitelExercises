package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;
//import static org.testng.AssertJUnit.*;

public class TurtleTest {
	private Turtle turtle;

	@BeforeEach
	public void setup(){
		turtle = new Turtle();
	}
	@Test
	public void turtleExistsTest(){
		assertNotNull(turtle);
	}

	@Test
	public void turtlePenIsUpByDefaultTest(){
		turtle.isPenDown();
		assertFalse(turtle.isPenDown());
	}

	@Test
	public void turtlePenMoveDownTest(){
		turtle.isPenUp();
		assertTrue(turtle.isPenUp());
		turtle.penDown();
		assertTrue(turtle.isPenDown());
	}

	@Test
	public void turtlePenMoveUpWhenDownTest(){
		turtle.penDown();
		assertTrue(turtle.isPenDown());
		turtle.penUp();
		assertFalse(turtle.isPenDown());
	}

	@Test
	public void turtlePositionIsEastByDefaultTest(){
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromEastTest(){
		turtle.turnRight();
		assertSame(SOUTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromSouthTest(){
		turtle.turnRight();
		turtle.turnRight();
		assertSame(WEST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromWestTest(){
		turtle.turnRight();
		turtle.turnRight();
		turtle.turnRight();
		assertSame(NORTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveRightFromNorthTest(){
		turtle.turnRight();
		turtle.turnRight();
		turtle.turnRight();
		turtle.turnRight();
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtlePositionIsFacingEastTest(){
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromEastTest(){
		turtle.turnLeft();
		assertSame(Direction.NORTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromNorthTest(){
		turtle.turnLeft();
		turtle.turnLeft();
		assertSame(WEST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromWestTest(){
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.turnLeft();
		assertSame(SOUTH, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveLeftFromSouthTest(){
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.turnLeft();
		turtle.turnLeft();
		assertSame(EAST, turtle.getCurrentDirection());
	}

	@Test
	public void turtleCanMoveForwardFacingEastTest(){
		turtle.move(3);
		assertEquals(new Position(0,2), turtle.getCurrentPosition());
		turtle.move(2);
		assertEquals(new Position(0,3), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveBackwardFacingEastTest(){
		turtle.move(3);
		assertEquals(new Position(0,2), turtle.getCurrentPosition());
		turtle.move(2);
		assertEquals(new Position(0,3), turtle.getCurrentPosition());
	}

	@Test
	public void turtleCanMoveForwardFacingSouthTest(){
		turtle.turnRight();
		turtle.move(3);
		assertEquals(new Position(2,0), turtle.getCurrentPosition());
		turtle.move(2);
		assertEquals(new Position(3,0), turtle.getCurrentPosition());

	}
//
//	@Test
//	public void whenPenIsDown
}