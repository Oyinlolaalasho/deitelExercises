package tddDeitelExercises;

public class Bike {

    private Boolean mode = false;
    private int speed;

    public void power(String state) {
        if (state == "on") mode = true;
        if (state == "off") mode = false;

    }
    public Boolean mode() {
        return mode;
    }
    public void acceleration() {
        if (speed > 40) {
            speed += 4;
        }
        if (speed > 31 && speed <= 40) {
            speed += 3;
        }
        if (speed >= 20 && speed <= 30) {
            speed += 2;
        }
        if (speed < 20) {
            speed += 1;
        }
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int speed() {
        return speed;
    }

    public void deceleration() {
        if (speed <= 20) {
            speed -= 1;
            return;
        }
        if (speed >= 20 && speed <= 30) {
            speed -= 2;
            return;
        }
        if (speed > 31 && speed <= 40) {
            speed -= 3;
            return;
        }
        if (speed > 40) {
            speed -= 4;
        }



    }

    public void accelerate() {
        if(speed > 40) {
            speed += 4;
        }
        if (speed > 30 && speed <= 40) {
            speed += 3;
        }
        if(speed > 20 && speed <= 30){
            speed += 2;
        }
        if (speed > 0 && speed <= 20){
            speed += 1;
        }
    }

}
