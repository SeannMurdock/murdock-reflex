package com.seannmurdock.murdock_reflex;


import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;


public class gameShowBuzzer2 extends Activity {
    private GBStatList stats = new GBStatList(2);
    private Stat stat = new Stat();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_show_buzzer2);
    }

    //Controls the pop up
    void popup(int num) {
        DialogFragment newFragment = gameBuzzDialog.newInstance(num);
        newFragment.show(getFragmentManager(),"dialog");
    }

    //Player 1 pressed first
    public void player1(View view) {
        stat.setData("1");
        stats.add(stat);
        popup(1);
    }
    //Player 2 pressed first
    public void player2(View view) {
        stat.setData("2");
        stats.add(stat);
        popup(2);
    }

}
