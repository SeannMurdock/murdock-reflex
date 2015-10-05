package com.seannmurdock.murdock_reflex;

import java.util.ArrayList;

/**
 * Created by murdock on 10/5/15.
 */
    public abstract class Statlist {

        protected ArrayList<Stat> stats = new ArrayList<Stat>();

        public void add(Stat stat){
            stats.add(0,stat);
        }

        public void clear(){
            this.stats = new ArrayList<Stat>();
        }
    }
