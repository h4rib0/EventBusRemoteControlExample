package devices;

import de.greenrobot.event.EventBus;
import events.MessageCommand;

public class Hottub {

    public static String TAG = "Hottub";
    MessageCommand messageCommand = new MessageCommand("");

    boolean on;
    int temperature;

    public Hottub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void circulate() {
        if (on) {
            messageCommand.setMessage("Hottub is bubbling!");
            EventBus.getDefault().post(messageCommand);
        }
    }

    public void jetsOn() {
        if (on) {
            messageCommand.setMessage("Hottub jets are on");
            EventBus.getDefault().post(messageCommand);
        }
    }

    public void jetsOff() {
        if (on) {
            messageCommand.setMessage("Hottub jets are off");
            EventBus.getDefault().post(messageCommand);
        }
    }

    public void setTemperature(int temperature) {
        if (temperature > this.temperature) {
            messageCommand.setMessage("Hottub is heating to a steaming " + temperature + " degrees");
            EventBus.getDefault().post(messageCommand);
        } else {
            messageCommand.setMessage("Hottub is cooling to " + temperature + " degrees");
            EventBus.getDefault().post(messageCommand);
        }
        this.temperature = temperature;
    }
}
