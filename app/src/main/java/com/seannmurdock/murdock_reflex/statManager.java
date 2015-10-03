package com.seannmurdock.murdock_reflex;


/**
 * Created by murdock on 10/2/15.
 */
public class statManager {
    public GBStatList gb2list;
    public GBStatList gb3list;
    public GBStatList gb4list;
    public RStatList rall;
    public RStatList r10;
    public RStatList r100;
    private int ramin;
    private int r10min;
    private int r100min;
    private int ramax;
    private int r10max;
    private int r100max;
    private float raavg;
    private float r10avg;
    private float r100avg;
    private String c21;
    private String c22;
    private String c31;
    private String c32;
    private String c33;
    private String c41;
    private String c42;
    private String c43;
    private String c44;


    public statManager(GBStatList gb2, GBStatList gb3, GBStatList gb4, RStatList ra, RStatList r10, RStatList r100) {
        this.gb2list = gb2;
        this.gb3list = gb3;
        this.gb4list = gb4;
        this.rall = ra;
        this.r10 = r10;
        this.r100 = r100;

    }

    public void statupdate() {
        this.ramin = this.rall.getMinval();
        this.r10min = this.r10.getMinval();
        this.r100min = this.r100.getMinval();
        this.ramax = this.rall.getMaxval();
        this.r10max = this.r10.getMaxval();
        this.r100max = this.r100.getMaxval();
        this.raavg = this.rall.getAvgval();
        this.r10avg = this.r10.getAvgval();
        this.r100avg = this.r100.getAvgval();
        this.c21 = this.gb2list.get(1);
        this.c22 = this.gb2list.get(2);
        this.c31 = this.gb3list.get(1);
        this.c32 = this.gb3list.get(2);
        this.c33 = this.gb3list.get(3);
        this.c41 = this.gb4list.get(1);
        this.c42 = this.gb4list.get(2);
        this.c43 = this.gb4list.get(3);
        this.c44 = this.gb4list.get(4);
    }

    public String getRamin() {
        return Integer.toString(ramin);
    }

    public String getR10min() {
        return Integer.toString(r10min);
    }

    public String getR100min() {
        return Integer.toString(r100min);
    }

    public String getRamax() {
        return Integer.toString(ramax);
    }

    public String getR10max() {
        return Integer.toString(r10max);
    }

    public String getR100max() {
        return Integer.toString(r100max);
    }

    public String getRaavg() {
        return Float.toString(raavg);
    }

    public String getR10avg() {
        return Float.toString(r10avg);
    }

    public String getR100avg() {
        return Float.toString(r100avg);
    }

    public String getC21() {
        return c21;
    }

    public String getC22() {
        return c22;
    }

    public String getC31() {
        return c31;
    }

    public String getC32() {
        return c32;
    }

    public String getC33() {
        return c33;
    }

    public String getC41() {
        return c41;
    }

    public String getC42() {
        return c42;
    }

    public String getC43() {
        return c43;
    }

    public String getC44() {
        return c44;
    }
}

