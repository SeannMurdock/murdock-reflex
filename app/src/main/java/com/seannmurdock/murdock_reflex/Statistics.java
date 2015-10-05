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
    @Override
    public void onResume() {
        super.onResume();
        updategsb();
    }


}
