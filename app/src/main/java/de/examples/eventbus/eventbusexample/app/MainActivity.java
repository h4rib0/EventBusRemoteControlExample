package de.examples.eventbus.eventbusexample.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;
import events.*;

public class MainActivity extends Activity {

    private View rootView;
    private RemoteControlSetup commands;

    private View indicator_light;
    private TextView output;
    private TextView textView_1, textView_2, textView_3, textView_4, textView_5, textView_6, textView_7;
    private Button undo;
    private Button button_1_1, button_1_2, button_2_1, button_2_2, button_3_1, button_3_2, button_4_1, button_4_2, button_5_1, button_5_2, button_6_1, button_6_2, button_7_1, button_7_2;
    private Command[] onCommands;
    private Command[] offCommands;
    private String[] slots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        rootView = findViewById(android.R.id.content);
        findViewsById();
        setupCommands();
        setupTextViews();
        setOnClickListener();
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }


    private void findViewsById() {

        indicator_light = rootView.findViewById(R.id.indicator_ligth);
        output = (TextView) rootView.findViewById(R.id.textView_output);
        undo = (Button) rootView.findViewById(R.id.undo);

        textView_1 = (TextView) rootView.findViewById(R.id.textView_1);
        textView_2 = (TextView) rootView.findViewById(R.id.textView_2);
        textView_3 = (TextView) rootView.findViewById(R.id.textView_3);
        textView_4 = (TextView) rootView.findViewById(R.id.textView_4);
        textView_5 = (TextView) rootView.findViewById(R.id.textView_5);
        textView_6 = (TextView) rootView.findViewById(R.id.textView_6);
        textView_7 = (TextView) rootView.findViewById(R.id.textView_7);

        button_1_1 = (Button) rootView.findViewById(R.id.button_1_1);
        button_1_2 = (Button) rootView.findViewById(R.id.button_1_2);
        button_2_1 = (Button) rootView.findViewById(R.id.button_2_1);
        button_2_2 = (Button) rootView.findViewById(R.id.button_2_2);
        button_3_1 = (Button) rootView.findViewById(R.id.button_3_1);
        button_3_2 = (Button) rootView.findViewById(R.id.button_3_2);
        button_4_1 = (Button) rootView.findViewById(R.id.button_4_1);
        button_4_2 = (Button) rootView.findViewById(R.id.button_4_2);
        button_5_1 = (Button) rootView.findViewById(R.id.button_5_1);
        button_5_2 = (Button) rootView.findViewById(R.id.button_5_2);
        button_6_1 = (Button) rootView.findViewById(R.id.button_6_1);
        button_6_2 = (Button) rootView.findViewById(R.id.button_6_2);
        button_7_1 = (Button) rootView.findViewById(R.id.button_7_1);
        button_7_2 = (Button) rootView.findViewById(R.id.button_7_2);
    }


    private void setupCommands() {
        commands = new RemoteControlSetup();
        onCommands = commands.getOnCommands();
        offCommands = commands.getOffCommands();
        slots = commands.getSlotNames();
    }

    private void setupTextViews() {
        textView_1.setText(slots[0]);
        textView_2.setText(slots[1]);
        textView_3.setText(slots[2]);
        textView_4.setText(slots[3]);
        textView_5.setText(slots[4]);
        textView_6.setText(slots[5]);
        textView_7.setText(slots[6]);
    }

    private void setOnClickListener() {

        button_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[0]);
            }
        });

        button_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[0]);
            }
        });

        button_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[1]);
            }
        });

        button_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[1]);
            }
        });

        button_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[2]);
            }
        });

        button_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[2]);
            }
        });

        button_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[3]);
            }
        });

        button_4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[3]);
            }
        });

        button_5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[4]);
            }
        });

        button_5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[4]);
            }
        });

        button_6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[5]);
            }
        });

        button_6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[5]);
            }
        });

        button_7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(onCommands[6]);
            }
        });

        button_7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(offCommands[6]);
            }
        });

        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Subscribe
    public void onEvent(LightOnCommand lightOnCommand) {
        lightOnCommand.execute();
    }

    @Subscribe
    public void onEvent(LightOffCommand lightOffCommand) {
        lightOffCommand.execute();
    }

    @Subscribe
    public void onEvent(TVOnCommand tvOnCommand) {
        tvOnCommand.execute();
    }

    @Subscribe
    public void onEvent(TVOffCommand tvOffCommand) {
        tvOffCommand.execute();
    }

    @Subscribe
    public void onEvent(StereoOnCommand stereoOnCommand) {
        stereoOnCommand.execute();
    }

    @Subscribe
    public void onEvent(StereoOffCommand stereoOffCommand) {
        stereoOffCommand.execute();
    }

    @Subscribe
    public void onEvent(HottubOnCommand hottubOnCommand) {
        hottubOnCommand.execute();
    }

    @Subscribe
    public void onEvent(HottubOffCommand hottubOffCommand) {
        hottubOffCommand.execute();
    }

    @Subscribe
    public void onEvent(MessageCommand messageCommand) {
        output.setText(messageCommand.getMessage());
    }


}
