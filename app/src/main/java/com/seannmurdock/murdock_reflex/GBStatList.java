package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;

/**
 * Created by murdock on 10/2/15.
 */
public class GBStatList {
    private ArrayList<Integer> stats = new ArrayList<Integer>();

    public GBStatList(int players) {
        for(int x=0; x< players; x++){
            this.stats.add(0);
        }
    }
    public void add(Stat stat){
        int x = Integer.parseInt(stat.getData());
        int y = this.stats.get(x-1);
        y = y +1;
        this.stats.set(x-1, y);
    }

    public String get(int i){
        int y = this.stats.get(i-1);
        return Integer.toString(y);
    }
}
