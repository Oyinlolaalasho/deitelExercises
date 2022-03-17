package tddTasks;

public class Bike {
    private boolean isOn;
    private int speed;

    public boolean isOn() {
        isOn = !isOn;
        return isOn;
    }

    public void accelerate() {
        if(speed >= 41){
            speed += 4;
        }
        if(speed >= 30 && speed <= 40){
            speed += 3;
        }
        if (speed >= 20 && speed < 30) {
            speed += 2;
        }
        if (speed < 20) {
            speed += 1;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (speed < 20) {
            speed -= 1;
        }
        if (speed >= 20 && speed < 30) {
            speed -= 2;
        }
        if(speed >= 30 && speed <= 40){
            speed -= 3;
        }
        if(speed >= 41){
            speed -= 4;
        }
    }
}
