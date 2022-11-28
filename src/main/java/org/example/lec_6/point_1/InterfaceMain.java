package org.example.lec_6.point_1;

public class InterfaceMain {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        Dog bulldog = new Bulldog();

        PameranShpits shpitz = new PameranShpits();
        shpitz.hasVoice();

//        shpitz = bulldog;
        shpitz.pee();

        AmericanDog americanDog = new Bulldog();
        //
    }
}
