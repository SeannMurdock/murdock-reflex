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

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Statistics extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }
    public void updategsb(){
        // 2 player stats
        gsb2controller gb2c = new gsb2controller();
        TextView p2p1 = (TextView) findViewById(R.id.textView33);
        p2p1.setText(gb2c.getGBStatList().get(0));
        TextView p2p2 = (TextView) findViewById(R.id.textView35);
        p2p2.setText(gb2c.getGBStatList().get(1));

        // 3 player stats
        gsb3controller gb3c = new gsb3controller();
        TextView p3p1 = (TextView) findViewById(R.id.textView37);
        p3p1.setText(gb3c.getGBStatList().get(0));
        TextView p3p2 = (TextView) findViewById(R.id.textView39);
        p3p2.setText(gb3c.getGBStatList().get(1));
        TextView p3p3 = (TextView) findViewById(R.id.textView41);
        p3p3.setText(gb3c.getGBStatList().get(2));

        // 4 player stats
        gsb4controller gb4c = new gsb4controller();
        TextView p4p1 = (TextView) findViewById(R.id.textView43);
        p4p1.setText(gb4c.getGBStatList().get(0));
        TextView p4p2 = (TextView) findViewById(R.id.textView45);
        p4p2.setText(gb4c.getGBStatList().get(1));
        TextView p4p3 = (TextView) findViewById(R.id.textView47);
        p4p3.setText(gb4c.getGBStatList().get(2));
        TextView p4p4 = (TextView) findViewById(R.id.textView49);
        p4p4.setText(gb4c.getGBStatList().get(3));

    }

    public void updatereactions(){
        // all time stats
        reactioncontroller rc = new reactioncontroller();
        TextView amin = (TextView) findViewById(R.id.textView7);
        amin.setText(rc.getRStatList().getmin(0));
        TextView amax = (TextView) findViewById(R.id.textView14);
        amax.setText(rc.getRStatList().getmax(0));
        TextView aavg = (TextView) findViewById(R.id.textView20);
        aavg.setText(rc.getRStatList().getavg(0));
        TextView amed = (TextView) findViewById(R.id.textView29);
        amed.setText(rc.getRStatList().getmed(0));

        //last 10 times
        TextView tenmin = (TextView) findViewById(R.id.textView10);
        tenmin.setText(rc.getRStatList().getmin(10));
        TextView tenmax = (TextView) findViewById(R.id.textView16);
        tenmax.setText(rc.getRStatList().getmax(10));
        TextView tenavg = (TextView) findViewById(R.id.textView22);
        tenavg.setText(rc.getRStatList().getavg(10));
        TextView tenmed = (TextView) findViewById(R.id.textView30);
        tenmed.setText(rc.getRStatList().getmed(10));

        //last 10 times
        TextView cmin = (TextView) findViewById(R.id.textView11);
        cmin.setText(rc.getRStatList().getmin(100));
        TextView cmax = (TextView) findViewById(R.id.textView18);
        cmax.setText(rc.getRStatList().getmax(100));
        TextView cavg = (TextView) findViewById(R.id.textView24);
        cavg.setText(rc.getRStatList().getavg(100));
        TextView cmed = (TextView) findViewById(R.id.textView50);
        cmed.setText(rc.getRStatList().getmed(100));



    }
    @Override
    public void onResume() {
        super.onResume();
        updategsb();
        updatereactions();
    }


}
