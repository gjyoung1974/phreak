package com.gyoung.demo.audio;

public class dialer {

    public static void main(String[] args) {

        /*
         * Dial some dtmf Tones:
         */

        try {
            dtmf.generateTones(350, 440, 5000, 10);
            dtmf.generateTones(770, 1209, 100, 10);
            //            payphone.dime();
            //            payphone.nickle();
            //            payphone.qaurter();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}