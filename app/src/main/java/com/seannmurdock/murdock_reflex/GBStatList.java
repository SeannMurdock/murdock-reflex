package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;

/**
 * Created by murdock on 10/2/15.
 */
public class GBStatList {
    private int players;
    private ArrayList<Integer> stats = new ArrayList<Integer>();

    public GBStatList(int players) {
        this.players = players;
        for(int x=0; x< players; x++){
            this.stats.add(0);
        }
    }
    public void add(Stat stat){
        int x = Integer.parseInt(stat.getData());
        int y = this.stats.get(x);
        y = y +1;
        this.stats.set(x, y);
    }
}
