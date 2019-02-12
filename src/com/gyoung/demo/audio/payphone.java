package com.gyoung.demo.audio;

public class payphone {

    public static void qaurter() throws Exception {
        dtmf.generateTones(1700, 2200, 33, 100);
        dtmf.generateTones(0, 0, 33, 100);
        dtmf.generateTones(1700, 2200, 33, 100);
        dtmf.generateTones(0, 0, 33, 100);
        dtmf.generateTones(1700, 2200, 33, 100);
        dtmf.generateTones(0, 0, 33, 100);
        dtmf.generateTones(1700, 2200, 33, 100);
        dtmf.generateTones(0, 0, 33, 100);
        dtmf.generateTones(1700, 2200, 33, 100);
        dtmf.generateTones(0, 0, 33, 100);
    }

    public static void dime() throws Exception {
        dtmf.generateTones(1700, 2200, 66, 100);
        dtmf.generateTones(0, 0, 66, 0);
        dtmf.generateTones(1700, 2200, 66, 100);
    }

    public static void nickle() throws Exception {
        dtmf.generateTones(1700, 2200, 66, 100);
    }
}