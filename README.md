# Phreak
Oldschool phone phreaking. 
Back in the early 90's when no kid owned a cellphone, 
I wrote an ANSI C program that output DTMF tones via terrible 8 bit audio.     
Made an even worse recording of it on a mono tape.    
Played it back into a payphone handset via my sony walkman's orange headphones.     

Voila, free calls! ...

(replicated here in Java for sake of Nostalgia)   

Dedicated to Bubbles!     
[Joy Bubbles](https://en.wikipedia.org/wiki/Joybubbles)     

Cheers!    
~Gordon

```java
public class dialer {

    public static void main(String[] args) {

        /*
         * Dial some dtmf Tones:
         */

        try {

         //   consists of a 0.4-second pulse, a 0.2-second pause, a 0.4-second pulse, and a 2-second pause.

//            //UK boop boop
//            dtmf.generateTones(400, 450, 400, 10);
//            dtmf.generateTones(0, 0, 200, 10);
//            dtmf.generateTones(400, 450, 400, 10);
//            dtmf.generateTones(0, 0, 2000, 10);
//            // 2
//            dtmf.generateTones(400, 450, 400, 10);
//            dtmf.generateTones(0, 0, 200, 10);
//            dtmf.generateTones(400, 450, 400, 10);
//            dtmf.generateTones(0, 0, 2000, 10);
//            // 3
//            dtmf.generateTones(400, 450, 400, 10);
//            dtmf.generateTones(0, 0, 200, 10);
//            dtmf.generateTones(400, 450, 400, 10);
//            dtmf.generateTones(0, 0, 2000, 10);
//            // end UK

           //USA Dialtone
           dtmf.generateTones(350, 440, 2000, 10);

           //USA dial a phone number
           dtmf.generateTones(770, 1336, 100, 10);
            dtmf.generateTones(770, 1336, 100, 10);
            dtmf.generateTones(941, 1336, 100, 10);
            dtmf.generateTones(697, 1209, 100, 10);
            dtmf.generateTones(697, 1447, 100, 10);
            dtmf.generateTones(941, 1336, 100, 10);
            dtmf.generateTones(852, 1336, 100, 10);

           // north america ring
            dtmf.generateTones(440, 480, 2000,0);
            dtmf.generateTones(0, 0, 4000, 0);
            dtmf.generateTones(440, 480, 2000,0);
            dtmf.generateTones(0, 0, 4000, 0);
            dtmf.generateTones(440, 480, 2000,0);
            dtmf.generateTones(0, 0, 4000, 0);
            dtmf.generateTones(440, 480, 2000,0);
            dtmf.generateTones(0, 0, 4000, 0);
           //

            //USA Busy Signal
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            dtmf.generateTones(480,620,500,0);
            dtmf.generateTones(0,0,500,0);
            //
            
//            //USA Payphone
//            payphone.dime();
//            payphone.nickle();
//            payphone.qaurter();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
```

#
