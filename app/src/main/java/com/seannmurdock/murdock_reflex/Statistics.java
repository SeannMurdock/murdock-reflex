package com.seannmurdock.murdock_reflex;

import android.app.Activity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Statistics extends Activity {
    private String rall = "rall.sav";
    private String r10 = "r10.sav";
    private String r100 = "r100.sav";
    private String GB2 = "buzz2.sav";
    private String GB3 = "buzz3.sav";
    private String GB4 = "buzz4.sav";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

    }
    @Override
    protected void onResume(){
        super.onResume();

    }

    private String loadgbistFromFile(String file) {
        String x ="0";
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fis = openFileInput(file);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            String inputstring;
            //http://chrisrisner.com/31-Days-of-Android--Day-23%E2%80%93Writing-and-Reading-Files/
            while ((inputstring = in.readLine()) != null){
                stringBuffer.append(inputstring);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            return x;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
        x = stringBuffer.toString();

        return x;
    }


}
