package com.seannmurdock.murdock_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class playerSelect extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_select);


    }
    //Switches the activity to the 2 player game show buzzer activity
    public void navigate2Players(View view){
        Intent intent = new Intent(this, gameShowBuzzer2.class);
        startActivity(intent);
    }
    //Switches the activity to the 3 player game show buzzer activity
    public void navigate3Players(View view) {
        Intent intent = new Intent(this, gameShowBuzzer3.class);
        startActivity(intent);
    }
    //Switches the activity to the 4 player game show buzzer activity
    public void navigate4Players(View view) {
        Intent intent = new Intent(this, gameShowBuzzer4.class);
        startActivity(intent);
    }



}
