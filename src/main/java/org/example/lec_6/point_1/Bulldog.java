package org.example.lec_6.point_1;

public class Bulldog implements AmericanDog {

    private boolean hasVoice;

    @Override
    public boolean hasVoice() {
        return hasVoice;
    }

    @Override
    public void pee() {
        System.out.println("I'm a Bulldog");
    }

    public void bite() {
        System.out.println("Shas ukushu!");
    }

    @Override
    public void doCommand(String command) {
        System.out.println("Ready to do " + command);
    }

}
