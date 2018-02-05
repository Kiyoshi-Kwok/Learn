package com.learn.basis.clockaim;

/**
 * Created by GIDEON on 2018/1/2.
 */
public class Display {
    int i;
    public Display(int i) {
        this.i = i;
    }

    public int getVal() {
        return i;
    }

    public void setVal(int i) {
        this.i = i;
    }

    public void tick() {
        i ++;
    }
}
