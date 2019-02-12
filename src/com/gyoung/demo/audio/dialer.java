package com.gyoung.demo.audio;

public class dialer {

    public static void main(String[] args) {

        /*
         * Dial some dtmf Tones:
         */

        try {
            dtmf.generateTones(697, 1209, 100, 20);

//            payphone.dime();
//            payphone.nickle();
//            payphone.qaurter();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}