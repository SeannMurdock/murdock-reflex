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
        newFragment.show(getFragmentManager(), "dialog");
    }

    //Player 1 pressed first
    public void player1(View view) {
        gsb2controller gb2c = new gsb2controller();
        gb2c.P1press();
        popup(1);
    }
    //Player 2 pressed first
    public void player2(View view) {
        gsb2controller gb2c = new gsb2controller();
        gb2c.P2press();
        popup(2);
    }

}
