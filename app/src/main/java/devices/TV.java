package devices;

import de.greenrobot.event.EventBus;
import events.MessageCommand;

public class TV {

    public static String TAG = "TV";
    MessageCommand messageCommand = new MessageCommand("");

    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        messageCommand.setMessage(location + " TV is on");
        EventBus.getDefault().post(messageCommand);
    }

    public void off() {
        messageCommand.setMessage(location + " TV is off");
        EventBus.getDefault().post(messageCommand);
    }

    public void setInputChannel() {
        this.channel = 3;
        messageCommand.setMessage(location + " TV channel is set for DVD");
        EventBus.getDefault().post(messageCommand);
    }
}
