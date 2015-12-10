package devices;

import de.greenrobot.event.EventBus;
import events.MessageCommand;

public class Light {

    public static String TAG = "Light";
    MessageCommand messageCommand = new MessageCommand("");
    String location;
    int level;


    public Light(String location) {
        this.location = location;
    }

    public void on() {
        level = 100;
        messageCommand.setMessage(location + "Light is on");
        EventBus.getDefault().post(messageCommand);
    }

    public void off() {
        level = 0;
        messageCommand.setMessage(location + "Light is off");
        EventBus.getDefault().post(messageCommand);
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            messageCommand.setMessage("Light is dimmed to " + level + "%");
            EventBus.getDefault().post(messageCommand);
        }
    }

    public int getLevel() {
        return level;
    }


}
