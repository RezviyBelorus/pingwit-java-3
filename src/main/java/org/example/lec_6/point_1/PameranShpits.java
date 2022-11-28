package org.example.lec_6.point_1;

public class PameranShpits implements Dog {
    private boolean hasVoice;

    @Override
    public boolean hasVoice() {
        System.out.println("Agressivniy shpits");

        return hasVoice;
    }

}
