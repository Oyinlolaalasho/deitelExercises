package DSA;

import java.util.Arrays;

public class MyHashMap {
	private String[] keys = new String[5];
	private String[] values = new String[5];
	private int counter;

	public boolean isEmpty() {
		if (counter > 0) return false;
		return true;
	}

	public void add(String key, String value) {
		Arrays.fill(keys, key);
		Arrays.fill(values, value);
		counter++;
	}

	public int size() {
		return counter;
	}

	public String get(String key) {
		return keys[Integer.parseInt(key)];
	}
}
