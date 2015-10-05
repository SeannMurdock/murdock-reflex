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
