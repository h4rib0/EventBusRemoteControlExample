package devices;

import de.greenrobot.event.EventBus;
import events.MessageCommand;

public class Stereo {

    public static String TAG = "Stereo";
    MessageCommand messageCommand = new MessageCommand("");

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        messageCommand.setMessage(location + " stereo is on");
        EventBus.getDefault().post(messageCommand);
    }

    public void off() {
        messageCommand.setMessage(location + " stereo is off");
        EventBus.getDefault().post(messageCommand);
    }

    public void setCD() {
        messageCommand.setMessage(location + " stereo is set for CD input");
        EventBus.getDefault().post(messageCommand);
    }

    public void setDVD() {
        messageCommand.setMessage(location + " stereo is set for DVD input");
        EventBus.getDefault().post(messageCommand);
    }

    public void setRadio() {
        messageCommand.setMessage(location + " stereo is set for Radio");
        EventBus.getDefault().post(messageCommand);
    }

    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        messageCommand.setMessage(location + " Stereo volume set to " + volume);
        EventBus.getDefault().post(messageCommand);
    }
}
