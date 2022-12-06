package org.example.lec_7.point_1;

public class RecursionMain {

    public static void main(String[] args) {
        show(0);
    }

    private static void show(int elem) {
        if (elem > 10) {
            return;
        }

        show(++elem);
        System.out.println(elem);
    }

    // 5! = 1*2*3*4*5
}
