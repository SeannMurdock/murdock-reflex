package com.seannmurdock.murdock_reflex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class playerSelect extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_select);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_player_select, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //Switches the activity to the 2 player game show buzzer activity
    public void navigate2Players(View view){
        Intent intent = new Intent(this, gameShowBuzzer.class);
        startActivity(intent);
    }
    //Switches the activity to the 3 player game show buzzer activity
    public void navigate3Players(View view) {
        Intent intent = new Intent(this, gameShowBuzzer.class);
        startActivity(intent);
    }
    //Switches the activity to the 4 player game show buzzer activity
    public void navigate4Players(View view) {
        Intent intent = new Intent(this, gameShowBuzzer.class);
        startActivity(intent);
    }



}
