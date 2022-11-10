package org.example.lec_2.point_4;

public class DoExample {
    public static void main(String[] args) {
        int ageCat = 20;

        while (ageCat < 20) {
            System.out.println("While");

            ageCat++;
        }

        // Do-While
        do {
            System.out.println("Do-While");

            ageCat++;
        } while (ageCat < 20);
    }

}
