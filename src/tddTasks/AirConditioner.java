package tddTasks;

public class AirConditioner {
    private boolean isOn;
    private int num = 16;

    public Boolean isOn() {
        isOn = !isOn;
        return isOn;
    }

    public void cooler() {
        if (num >= 16 && num < 30) {
            num++;
            return;
        }
        if (num > 30) {
            num = 0;
        }
    }

    public void heater() {
        if (num > 16 && num <= 30) {
            num-= 1;
            return;
        }
        if (num < 16){
            num = 0;
        }
    }

    public int getTemperature() {
        return num;
    }
}

