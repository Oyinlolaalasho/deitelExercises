package tddDeitelExercises;

public class AirConditioner {

    private Boolean mode = false;
    private int temperature = 16;

    public void power(String status) {
        if (status == "on") {
            mode = true;
        }
        if (status == "off") {
            mode = false;
        }
    }
    public Boolean mode() {
        return mode;
    }


    public void increaseTemperature() {
//       if (temperature <30)
//            temperature += 1;
        if (temperature >= 16 && temperature < 30) {
            temperature += 1;
        }
        if (temperature > 30) {
            temperature = 30;
        }
    }
    //public void setTemperature(int temperature) {
      //  this.temperature += temperature;   {
//        }
//    }
    public int temperature() {
       return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16 && temperature <= 30) {
            temperature -= 1;
        }
        if (temperature < 16) {
            temperature = 16;
        }
    }

    public void getTemperature(int temperature) {
        if (this.temperature == 16)  {
            this.temperature += temperature;
        }
    }

    public void setTemperature(int degree) {
    }
}
