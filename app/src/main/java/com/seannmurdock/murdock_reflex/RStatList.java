package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by murdock on 10/2/15.
 */
public class RStatList {
    protected ArrayList<Stat> stats = new ArrayList<Stat>();


    public int getcount() {
        return stats.size();
    }

    public void add(int i,Stat stat){
        this.stats.add(i,stat);

    }
    public String getmax(int i){
        int x = this.getcount();
        if(x>0) {
            if (i == 0) {
                i = this.getcount();
            }
            if (i > getcount()) {
                i = this.getcount();
            }
            int max = 0;
            Stat stat;
            for (int y = 0; y < i; y++) {
                stat = stats.get(y);
                if (max < Integer.parseInt(stat.getData())) {
                    max = Integer.parseInt(stat.getData());
                }
            }

            return String.valueOf(max);
        }
        else {
            return "0";
        }
    }

    public String getmin(int i){
        int x = this.getcount();
        if(x>0) {

            if (i == 0) {
                i = this.getcount();
            }
            if (i > getcount()) {
                i = this.getcount();
            }
            int min = 100000000;
            Stat stat;
            for (int y = 0; y < i; y++) {
                stat = stats.get(y);
                if (min > Integer.parseInt(stat.getData())) {
                    min = Integer.parseInt(stat.getData());
                }
            }

            return String.valueOf(min);
        }
        else{
            return "0";
        }
    }

    public String getavg(int i){
        int x = this.getcount();
        if(x>0) {

            if (i == 0) {
                i = this.getcount();
            }
            if (i > getcount()) {
                i = this.getcount();
            }
            int total = 0;
            Stat stat;
            for (int y = 0; y < i; y++) {
                stat = stats.get(y);
                total = total + Integer.parseInt(stat.getData());
            }
            total = total / i;

            return String.valueOf(total);
        }
        else {
            return "0";
        }
    }

    // calculates the median value
    public String getmed(int i) {
        int x = this.getcount();
        if(x>0) {
            if (i == 0) {
                i = this.getcount();
            }
            if (i > getcount()) {
                i = this.getcount();
            }
            int total = 0;
            ArrayList<Integer> ints = new ArrayList<Integer>();
            Stat stat;
            for (int y = 0; y < i; y++) {
                stat = stats.get(y);
                ints.add(Integer.parseInt(stat.getData()));
                Collections.sort(ints);
            }
            float median = 0;
            if (i == 0) {
                //even number list
                //need to average the

                int a = i;
                a = a / 2;
                int b = a - 1;
                median = (ints.get(a) + ints.get(b)) / 2;
            } else {
                int a = i;
                a = a / 2 + 1;
                median = (ints.get(a));
            }
            return String.valueOf(median);
        }
        else {
            return "0";
        }

    }
}
