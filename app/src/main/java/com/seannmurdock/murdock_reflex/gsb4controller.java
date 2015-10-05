package com.seannmurdock.murdock_reflex;

/**
 * Created by murdock on 10/5/15.
 */
public class gsb4controller {
    private static GBStatList gsb4 =  null;
    static public GBStatList getGBStatList() {
        if(gsb4 ==null){
            gsb4 = new GBStatList(4);
        }
        return gsb4;
    }

    public void P1press() {
        Stat stat = new Stat();
        stat.setData("1");
        getGBStatList().add(stat);
    }

    public void P2press() {
        Stat stat = new Stat();
        stat.setData("2");
        getGBStatList().add(stat);
    }

    public void P3press() {
        Stat stat = new Stat();
        stat.setData("3");
        getGBStatList().add(stat);
    }

    public void P4press() {
        Stat stat = new Stat();
        stat.setData("4");
        getGBStatList().add(stat);
    }
}
