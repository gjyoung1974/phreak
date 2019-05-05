package com.gyoung.demo.audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

// a dtmf dialer with javax.sound
public class dtmf {

    public static void generateTones(float hz1, float hz2, int msecs, int volume)
            throws Exception {
        float frequency = 44100.0F;
        int samplesize = 8;
        int channels;
        boolean signed = true;
        boolean bigendian = false;
        byte[] buf;
        double ttpi = (2.0 * Math.PI);
        AudioFormat format;
        buf = new byte[2];
        channels = 1;
        format = new AudioFormat(frequency, samplesize, channels, signed,
                bigendian);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(format);
        sdl.open(format);
        sdl.start();
        for (int i = 0; i < msecs * frequency / 1000; i++) {

            double angle = i / (frequency / hz1) * ttpi;
            double angle2 = i / (frequency / hz2) * ttpi;
            buf[0] = (byte) (((Math.sin(angle)) + (Math.sin(angle2))) * 10);
            sdl.write(buf, 0, 1);
        }
        sdl.drain();
        sdl.stop();
        sdl.close();
    }
}
