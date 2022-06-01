package Polymorphism;

public class Forest {

    public static void main(String[] args) {
        Bird b = new Aje();
        Animal a = new Aje();
        Aje c = (Aje)b;
        a.jump();
        b.jump();
    }
}
