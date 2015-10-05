package com.seannmurdock.murdock_reflex;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;


public class gameShowBuzzer3 extends Activity {
    private GBStatList stats = new GBStatList(3);
    private Stat stat = new Stat();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_show_buzzer3);
    }
    //Controls the pop up
    void popup(int num) {
        DialogFragment newFragment = gameBuzzDialog.newInstance(num);
        newFragment.show(getFragmentManager(), "dialog");
    }

    //Player 1 pressed first
    public void player1(View view) {
        gsb3controller gb3c = new gsb3controller();
        gb3c.P1press();
        popup(1);
    }
    //Player 2 pressed first
    public void player2(View view) {
        gsb3controller gb3c = new gsb3controller();
        gb3c.P2press();
        popup(2);
    }
    //Player 2 pressed first
    public void player3(View view) {
        gsb3controller gb3c = new gsb3controller();
        gb3c.P3press();
        popup(3);
    }


}
