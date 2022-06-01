package Animal;

public class Forest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Rabbit();
        animals[1] = new Rat();
        animals[2] = new Chicken();
        animals[3] = new Animal();

        for (var animal: animals) {
            animal.move();
        }

            var rabbit = new Rabbit();
            Animal rabbit2 = new Rabbit();
            Animal rabbit3 = new Rabbit();
            Rabbit rabbit4 = (Rabbit) rabbit3;
            rabbit4.move();


    }
}
