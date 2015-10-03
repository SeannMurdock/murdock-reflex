package com.seannmurdock.murdock_reflex;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class gameShowBuzzer2 extends Activity {
    private GBStatList stats = new GBStatList(2);
    private Stat stat = new Stat();
    private static final String FILENAME = "buzz2.sav";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_show_buzzer2);
    }

    //Controls the pop up
    void popup(int num) {
        DialogFragment newFragment = gameBuzzDialog.newInstance(num);
        newFragment.show(getFragmentManager(), "dialog");
    }

    //Player 1 pressed first
    public void player1(View view) {
        stat.setData("1");
        stats.add(stat);
        saveInFile();
        popup(1);
    }
    //Player 2 pressed first
    public void player2(View view) {
        stat.setData("2");
        stats.add(stat);
        saveInFile();
        popup(2);
    }
    //Taken from lonelyTwitter
    private void saveInFile() {
        String spacer = " ";
        try {
            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE
                    );
            for (int i = 1; i < 3; i++) {
                fos.write(this.stats.get(i).getBytes());
                fos.write(spacer.getBytes());
                fos.close();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
    }

}
