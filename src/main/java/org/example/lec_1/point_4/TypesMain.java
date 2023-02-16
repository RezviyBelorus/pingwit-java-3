package org.example.lec_1.point_4;

public class TypesMain {
    public static void main(String[] args) {
        
        //test
        /*
        целочисленнве типы
        byte 2^8 -> 256 -> -128 +127
        short 2^16 -> 65536 -> -32768 +32767
        char 2^16-1 -> 0-65535
        int 2^32
        long 2^64
         */

        /*
        float min=1.4E-45 max=3.4028235E38 -> 1.4*10^-45
        double min=4.9E-324 max=1.7976931348623157E308
         */

        /*
        boolean -> true/false
         */

        /*
        String
         */

        byte myByte = 127;
        System.out.println(myByte);

        char myCharNumber = 33;
        System.out.println(myCharNumber);


        char myCharSymbol = '3';
        System.out.println(myCharSymbol);

        char myCharUtf = '\u33f4';
        System.out.println(myCharUtf);

        System.out.println(myCharNumber + myCharUtf);

        double myDouble = 255;
        System.out.println(myDouble);

        boolean myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Vse budet super" + " " + "nepremenno";
        System.out.println(myString);

    }
}
