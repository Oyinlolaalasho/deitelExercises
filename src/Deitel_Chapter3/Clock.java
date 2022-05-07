package Deitel_Chapter3;

public class Clock {

    private int hour;
    private int minute;
    private int second;
    private String time;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour > 23 || hour < 0) this.hour = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if (minute > 59) this.minute = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setSeconds(int second) {
        this.second = second;
        if (second > 59) this.second = 0;
    }

    public int getSeconds() {
        return second;
    }

    public void displayTime() {
        this.time = hour + ":" + minute + ":" + second;
    }

    public String getDisplayTime() {
        return time;
    }
}
