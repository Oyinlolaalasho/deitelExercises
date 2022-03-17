package tddDeitelExercises;

public class Television<status> {

    private Boolean mode;
    private int volume;
    private int channel = 1;
    private int mute;
    private boolean status = false;
    private boolean muteToggle;

    public void power(String status) {
        if (status == "on") mode = true;
        if (status == "off") mode = false;
        
//    public Boolean power(){
//        isOn = !isOn
//        }

    }

    public Boolean isOn() {
        return mode;
    }

    public int volumeUp() {
        if (muteToggle)
            return volume;
//        mute = volume;
        if (volume < 20) {
            volume += 1;
            mute += 1;
        }
        return volume;
    }

    public int volume() {
        return mute;
    }

    public int volumeDown() {
        if (muteToggle)
            return volume;
        mute = volume;
        if (volume > 0) {
            volume -= 1;
            mute -= 1;
        }
        return volume;
    }


    public void increaseChannel() {
        if (channel < 20)
            channel += 1;
    }

    public int channel() {
        return channel;
    }

    public void decreaseChannel() {
        if(channel > 1 && channel < 20)
            channel -= 1;
    }

    public void inputChannel(int number) {
        if (number < 1) number = 1;
        if (number > 20) number = 20;
        channel = number;

    }

    public void muteVolume() {
        mute = 0;
    }

    public void unmuteVolume() {
        mute = volume;
    }

    public boolean switcher() {
        if(!status)
            return true;

        if (status)
            return false;

        return this.status;
    }

    public Boolean status() {
        return this.status;
    }

    public boolean muteToggle() {
        muteToggle = !muteToggle;
        return muteToggle;
    }
}