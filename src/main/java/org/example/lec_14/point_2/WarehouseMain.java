package org.example.lec_14.point_2;

import java.util.Arrays;

public class WarehouseMain {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new Integer[]{1, 2});
        Warehouse integerWarehouse = new Warehouse(new Integer[]{1, 2});

        String[] data = null;

        if (warehouse.getData() instanceof String[]) {
            data = (String[]) warehouse.getData();
        }

        Integer[] integerData = null;

        if (warehouse.getData() instanceof Integer[]) {
            integerData = (Integer[]) warehouse.getData();
        }

        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(integerData));
    }
}
