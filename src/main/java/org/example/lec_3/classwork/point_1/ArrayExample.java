package org.example.lec_3.classwork.point_1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] warehouse = new Integer[5];

        System.out.println(warehouse.toString());

        System.out.println("For example");
        for (int i = 0; i < warehouse.length; i++) {
            Integer elem = warehouse[i];
            System.out.println(elem);
        }

        System.out.println("Foreach example");
        for (Integer elem : warehouse) {
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(warehouse));

        for (int i = 0; i < warehouse.length; i++) {
            warehouse[i] = (int) (Math.random() * 1000);
        }

        System.out.println(Arrays.toString(warehouse));


        Integer[] initArray = {33, 44, 66};
        System.out.println(initArray.length);
        System.out.println(Arrays.toString(initArray));

        initArray = new Integer[] {11, 0};
    }

}

