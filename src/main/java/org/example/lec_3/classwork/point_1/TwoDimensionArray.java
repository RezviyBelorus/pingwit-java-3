package org.example.lec_3.classwork.point_1;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] array2d = new int[10][4];

        for (int i = 0; i < array2d.length; i++) {
            int[] row = array2d[i];

            for (int j = 0; j < row.length; j++) {
                row[j] = 3;
                System.out.print(row[j] + ", ");
            }
            System.out.println();
        }

        System.out.println("===");
        for (int[] row : array2d) {
            System.out.println(Arrays.toString(row));
        }

        int[][] initArray2d = {
            {1, 2, 3},
            {99, 88, 77}
        };

        System.out.println("===");
        for (int[] row : initArray2d) {
            System.out.println(Arrays.toString(row));
        }
    }

}
