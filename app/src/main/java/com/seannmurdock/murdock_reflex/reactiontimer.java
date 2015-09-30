package com.seannmurdock.murdock_reflex;


import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;


public class reactiontimer extends ActionBarActivity {
    public Button timeButton;
    public boolean b;
    private Handler h = new Handler();
    private Random r = new Random();
    private long starttime;
    private long endtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactiontimer);
        timeButton = (Button) findViewById(R.id.button4);
        timeButton.setTag("1");
        timeButton.setText("Wait");

    }


            @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reactiontimer, menu);
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

    //uses handler to manage waiting and generates a random number of time to wait
    @Override
    public void onResume() {
        super.onResume();
        timeButton = (Button) findViewById(R.id.button4);
        b = true;
        timeButton.setText("Wait");
        int wait = r.nextInt(1990) + 10;
        h.postDelayed(test1, wait);
    }

    //changes the function and text of the button from waiting to pressing
    public Runnable test1 = new Runnable() {
        @Override
        public void run(){
            b = false;
            timeButton.setText("Press!");
            //start timer
            starttime = System.currentTimeMillis();

        }
    };
// manages button depending on the boolean b
    public void buttonclick(View view) {
        // if button is pressed to early
        if (b){
            String astring = "wait for the prompt!";
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            textView3.setText(astring);
             onResume();
        } else {
            // record time and reset clocks
            String astring;
            String bstring = "";
            TextView textView4=(TextView)findViewById(R.id.textView4);
            TextView textView3 = (TextView) findViewById(R.id.textView3);
            long end = System.currentTimeMillis();
            end = end - starttime;
            astring = String.valueOf(end);
            textView4.setText(astring);
            textView3.setText(bstring);
            onResume();
        }
    }




}


