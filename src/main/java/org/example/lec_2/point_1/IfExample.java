package org.example.lec_2.point_1;

public class IfExample {
    public static void main(String[] args) {
        byte ageCat = 100;
        byte ageDog = 100;

        if (ageCat > ageDog) {
            System.out.println("ageCat = " + ageCat);
            System.out.println(System.currentTimeMillis());
        } else if(ageCat < ageDog) {
            System.out.println("ageDog = " + ageDog);
        } else {
            System.out.println("ageCat == ageDog");
        }

    }

}
