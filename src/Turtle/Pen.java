package Turtle;

public class Pen{
	private boolean isDown;

	public void penDown() {
		isDown = true;
	}

	public boolean isDown() {
		return isDown;
	}

	public void penUp() {
		isDown = false;
	}
}
