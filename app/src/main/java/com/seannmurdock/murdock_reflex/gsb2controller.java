package com.seannmurdock.murdock_reflex;

/**
 * Created by murdock on 10/5/15.
 */

// Singleton from studentpicker
public class gsb2controller {
    private static GBStatList gsb2 =  null;
    static public GBStatList getGBStatList() {
        if(gsb2 ==null){
            gsb2 = new GBStatList(2);
        }
        return gsb2;
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
}
