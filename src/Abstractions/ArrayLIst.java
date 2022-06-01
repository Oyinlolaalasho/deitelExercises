package Abstractions;

public class ArrayLIst implements List {
    private int counter = 0;
    private String[] db;

    @Override
    public void add(String item) {
        db[counter] = item;
        counter++;
        String[] db = new String[5];
    }

    @Override
    public void add(int index, String item) {

    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public void remove(String item) {


    }

    @Override
    public void remove(int index) {
        counter--;

    }


    @Override
    public int size() {
        return counter++;
    }
}
