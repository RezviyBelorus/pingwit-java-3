package org.example.lec_10.point_1;

public class StringInternMain {
    public static void main(String[] args) {
        String egorka = "Egorka";
        String olya = new String("Egorka").intern();


//        egorka = egorka + "Tratata";

        String name = "Egorka";

        System.out.println(egorka == name);
        System.out.println(egorka == olya);
        System.out.println(egorka.equals(olya));
    }

}
