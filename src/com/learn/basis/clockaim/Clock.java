package com.learn.basis.clockaim;

/**
 * Created by GIDEON on 2018/1/2.
 */
public class Clock {
    Display hour;
    Display minute;
    Display second;
    public Clock(int h, int m, int s) {
        hour = new Display(h);
        minute = new Display(m);
        second = new Display(s);
    }

    public void tick() {
        second.tick();

        if (second.getVal() == 60) {
            second.setVal(0);
            minute.tick();
        }

        if (minute.getVal() == 60) {
            minute.setVal(0);
            hour.tick();
        }

        if (hour.getVal() == 24) {
            hour.setVal(0);
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d",hour.getVal(),minute.getVal(),second.getVal());
    }
}
