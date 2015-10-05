package com.seannmurdock.murdock_reflex;

/**
 * Created by murdock on 10/5/15.
 */
public class gsb3controller{
    private static GBStatList gsb3 =  null;
    static public GBStatList getGBStatList() {
        if(gsb3 ==null){
            gsb3 = new GBStatList(3);
        }
        return gsb3;
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

}
