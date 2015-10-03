package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;

/**
 * Created by murdock on 10/2/15.
 */
public class RStatList extends StatList{
    private int maxlen;
    private int maxval = 0;
    private int minval = 0;
    private float avgval = 0;

    public RStatList(int maxlen) {
        this.maxlen = maxlen;
    }
    public int getcount() {
        return stats.size();
    }
    public void setavg(){
        int x = this.getcount();
        float total = 0;
        Stat stat;
        for(int y = 0; y < x;  y++  ){
                stat = stats.get(y);
                total = total + Integer.parseInt(stat.getData());
        }
        total = total/x;
        this.avgval = total;
    }
    public void setmax(){
        int x =this.getcount();
        int max = 0;
        Stat stat;
        for(int y = 0; y<x; y++){
            stat = stats.get(y);
            if (max < Integer.parseInt(stat.getData())) {
                max = Integer.parseInt(stat.getData());
            }
        }
        this.maxval = max;
    }
    public void setmin(){
        int x = this.getcount();
        int min = 0;
        Stat stat;
        for (int y = 0; y<x; y++){
            stat = stats.get(y);
            if (min > Integer.parseInt(stat.getData())){
                min = Integer.parseInt(stat.getData());
            }
        }
        this.minval = min;
    }

    public void update(){
        this.setavg();
        this.setmax();
        this.setmin();
    }
    @Override
    public void add(Stat stat){
        int x = this.getcount();
        if( x >= this.maxlen){
            this.stats.remove(this.maxlen -1);
            this.stats.add(stat);
        }
        else{
            this.stats.add(stat);
        }
    }
    public int getMaxval(){
        return this.maxval;
    }

    public int getMinval() {
        return minval;
    }

    public float getAvgval() {
        return avgval;
    }
}
