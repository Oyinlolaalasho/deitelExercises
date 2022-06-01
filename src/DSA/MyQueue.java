package DSA;

public class MyQueue {
	private int counter;
	private boolean isEmpty = true;
	private boolean isNotEmpty =false;
	private int length = 4;
	private String db[] = new String[length];

	public boolean isEmpty() {
		if(counter == 0) {
			return isEmpty;
		}
		return isNotEmpty;
	}

	public void push(String element) {
		db[counter] = element;
		counter++;
	}

	public boolean isNotEmpty() {
		return isNotEmpty;
	}

	public String peek() {
		return db[0];
	}

	public String pop() {
		counter--;
		String temp = db[0];
		db[0] = null;
		for (int i = 0; i < db.length-1; i++) {
			db[i] = db[i+1];
		}
		return temp;
	}

	public int size() {
		return counter;
	}
}
