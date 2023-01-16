package org.example.lec_14.point_3;

public class Ship {

    private String madeInCountryCode;

    public <T extends Country> Ship(T madeIn) {
        madeInCountryCode = madeIn.getCountryCode();
    }

    public String getMadeInCountryCode() {
        return madeInCountryCode;
    }

}
