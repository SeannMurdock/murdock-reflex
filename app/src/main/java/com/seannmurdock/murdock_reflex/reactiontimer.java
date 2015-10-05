/*
Copyright 2015 Seann Murdock

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactiontimer);
        timeButton = (Button) findViewById(R.id.button4);
        timeButton.setTag("1");
        timeButton.setText("Wait");

    }

    //uses handler to manage waiting and generates a random number of time to wait
    @Override
    public void onResume() {
        super.onResume();
        timeButton = (Button) findViewById(R.id.button4);
        b = true;
        timeButton.setText("Wait");
        int wait = r.nextInt(1990) + 10;
        h.postDelayed(start, wait);
    }

    //changes the function and text of the button from waiting to pressing
    public Runnable start = new Runnable() {
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
            reactioncontroller rc = new reactioncontroller();
            rc.add(end);
            astring = String.valueOf(end);
            textView4.setText(astring);
            textView3.setText(bstring);
            onResume();
        }
    }




}


