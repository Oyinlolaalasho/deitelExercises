package tddDeitelExercises;

public class Time {

    private int hour;

    private int minute;

    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second){
        validateSecondFor(second);
        this.second = second;
    }

    public int getMinute(int minute){
        return minute;
    }

    public void setMinute(int minute) {
        validateMinuteFor(minute);
        this.minute = minute;
    }

    public int getHour(int hour){
        return hour;
    }

    public void setHour(int hour){
        validateHourFor(hour);
        this.hour = hour;
    }

    private void validate(int hour, int minute, int second) {
        validateHourFor(hour);
        validateMinuteFor(minute);
        validateSecondFor(second);
    }

    private static void validateHourFor(int hour){
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }

    private static void validateMinuteFor(int minute){
        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        if (minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
    }

    private static void validateSecondFor(int second){
        boolean secondIsInvalid = second < 0 || second >= 60;
        if (secondIsInvalid) throw new IllegalArgumentException("Invalid second");
    }

//    public Time
//
//   public Time(int minute, int second){
//        this(0, minute, second);
//   }

}
