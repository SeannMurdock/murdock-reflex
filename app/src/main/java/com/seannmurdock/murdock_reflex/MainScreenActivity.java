package com.seannmurdock.murdock_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    // Switches to the reaction timer activity
    public void navigateReflex(View view){
        Intent intent = new Intent(this, reactiontimer.class);
        startActivity(intent);
    }
    // Switches to the player selection activity
    public void navigateplayerSelect(View view) {
        Intent intent = new Intent(this, playerSelect.class);
        startActivity(intent);
    }
    // Switches to the statistics activity
    public void navigateStatistics(View view) {
        Intent intent = new Intent(this, Statistics.class);
        startActivity(intent);
    }

}
