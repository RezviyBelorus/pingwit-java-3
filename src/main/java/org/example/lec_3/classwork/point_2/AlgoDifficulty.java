package org.example.lec_3.classwork.point_2;

import java.util.Arrays;

public class AlgoDifficulty {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i : array) { // O(n)
            System.out.println(i);
        }

        int[][] array2d = new int[5][5];

        for (int i = 0; i < array2d.length; i++) { // O(n²)
            int[] row = array2d[i];
            for (int j = 0; j < row.length; j++) {
                System.out.println(row[j]);
            }
        }

        int i = array[4];

        int[] arrayBig = new int[1000_000]; // O(1)
        int arrayBigElem = arrayBig[99999]; // O(1)

        // [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1] O(n)
        // [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1] O(n)


    }
}
