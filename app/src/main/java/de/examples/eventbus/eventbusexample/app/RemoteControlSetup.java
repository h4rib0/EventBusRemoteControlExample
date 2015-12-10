package de.examples.eventbus.eventbusexample.app;


import devices.Hottub;
import devices.Light;
import devices.Stereo;
import devices.TV;
import events.*;

public class RemoteControlSetup {

    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];
    String[] slotNames = new String[7];
    Command undoCommand;


    public RemoteControlSetup() {
        setupCommands();
    }


    private void setupCommands() {

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        NoCommand noCommand = new NoCommand();

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);


        slotNames[0] = "Light Liviging Room";
        slotNames[1] = "TV Liviging Room";
        slotNames[2] = "Stero Liviging Room";
        slotNames[3] = "Hottube";
        slotNames[4] = "Unset";
        slotNames[5] = "Unset";
        slotNames[6] = "Unset";

        onCommands[0] = lightOn;
        onCommands[1] = tvOn;
        onCommands[2] = stereoOn;
        onCommands[3] = hottubOn;
        onCommands[4] = noCommand;
        onCommands[5] = noCommand;
        onCommands[6] = noCommand;

        offCommands[0] = lightOff;
        offCommands[1] = tvOff;
        offCommands[2] = stereoOff;
        offCommands[3] = hottubOff;
        offCommands[4] = noCommand;
        offCommands[5] = noCommand;
        offCommands[6] = noCommand;
    }

    public Command[] getOnCommands() {
        return onCommands;
    }

    public Command[] getOffCommands() {
        return offCommands;
    }

    public String[] getSlotNames() {
        return slotNames;
    }
}
