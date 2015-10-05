package com.seannmurdock.murdock_reflex;

/**
 * Created by murdock on 10/5/15.
 */
public class reactioncontroller {
    private static RStatList rs =  null;
    static public RStatList getRStatList() {
        if(rs ==null){
            rs = new RStatList();
        }
        return rs;
    }
    public void add(long l){
        String x = String.valueOf(l);
        Stat stat = new Stat(x);
        getRStatList().add(0,stat);
    }
}
