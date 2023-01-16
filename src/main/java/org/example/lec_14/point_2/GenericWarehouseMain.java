package org.example.lec_14.point_2;

import java.util.Arrays;

public class GenericWarehouseMain {
    public static void main(String[] args) {
        GenericWarehouse<String> warehouse = new GenericWarehouse<>(new String[]{"A", "B"});
//        GenericWarehouse<String> warehouse = new GenericWarehouse(new Integer[] {1, 2});

        String[] data = warehouse.getData();

        System.out.println(Arrays.toString(data));
    }

}
