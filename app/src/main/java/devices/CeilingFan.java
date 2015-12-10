package devices;

import events.MessageCommand;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    public static String TAG = "CeilingFan";
    MessageCommand messageCommand = new MessageCommand("");
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = HIGH;
        messageCommand.setMessage(location + " ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        messageCommand.setMessage(location + " ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        messageCommand.setMessage(location + " ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        messageCommand.setMessage(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
