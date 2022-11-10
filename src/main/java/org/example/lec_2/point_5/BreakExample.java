package org.example.lec_2.point_5;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 10; j = j + 3) {
                if (j > 2) {
                    break;
                }
                System.out.println("j=" + j);
            }

            System.out.println("i=" + i);
            System.out.println();

        }

        System.out.println("After the cycle");
    }

}
