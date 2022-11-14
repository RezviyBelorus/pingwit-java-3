package org.example.lec_3.classwork.point_3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // [3, 1, 2]
        // [1,3,2]
        // [1,2,3]

        int[] initArray = {1, 2, 3};

        System.out.println(Arrays.toString(initArray));

        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < initArray.length; i++) { // 0,1,2
                if (initArray[i - 1] > initArray[i]) {
                    int tmp = initArray[i]; // 4 [7,4,3]
                    initArray[i] = initArray[i - 1]; // [4,4,3]
                    initArray[i - 1] = tmp; // [4,7,3]

                    needToSort = true;
                }
            }
        }

        System.out.println(Arrays.toString(initArray));
    }

}
