package org.example.lec_14.point_3;

public class CountryMain {
    public static void main(String[] args) {
        Ship ship = new Ship(new China());

        String madeInCountryCode = ship.getMadeInCountryCode();

        System.out.println(madeInCountryCode);
    }
}
