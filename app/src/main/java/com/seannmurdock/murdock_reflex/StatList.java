package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;

/**
 * Created by murdock on 10/2/15.
 */
public abstract class StatList {

    protected ArrayList<Stat> stats = new ArrayList<Stat>();

    public void add(Stat stat){
        stats.add(stat);
    }

    public void clear(){
        this.stats = new ArrayList<Stat>();
    }
}
