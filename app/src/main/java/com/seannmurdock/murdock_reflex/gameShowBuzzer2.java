package com.seannmurdock.murdock_reflex;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class gameShowBuzzer2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_show_buzzer2);
    }

    void popup(int num) {
        DialogFragment newFragment = gameBuzzDialog.newInstance(num);
        newFragment.show(getFragmentManager(),"dialog");
    }

    //Player 1 pressed first
    public void player1(View view) {
        popup(1);
    }
    //Player 2 pressed first
    public void player2(View view) {
        popup(2);
    }

}
