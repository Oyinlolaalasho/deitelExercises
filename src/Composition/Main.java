package Composition;

public class Main {
    public static void main(String[] args) {
        ChristianPray pray1 = new ChristianPray();
        Pray pray2 = new Pray();
        MuslimPray pray3 = new MuslimPray();
        Walk walk = new Walk();
        PapaNoso Chisom = new PapaNoso(pray2,walk);
        PapaNoso Ade = new PapaNoso(pray2,walk);

        Chisom.pray();
        Ade.pray();

        Chisom.setPray(pray1);

        Chisom.pray();

        CatWalk walk1 = new CatWalk();
        Walk walk2 = new Walk();
        DogWalk walk3 = new DogWalk();
        Chisom.walk();
        Ade.walk();

        Chisom.setWalk(walk3);
        Ade.setWalk(walk1);
        Ade.walk();
        Chisom.walk();

    }
}
