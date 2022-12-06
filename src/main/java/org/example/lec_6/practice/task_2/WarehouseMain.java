package org.example.lec_6.practice.task_2;

public class WarehouseMain {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Fruit("banana");
        fruits[1] = new Fruit("melon");
        fruits[2] = new Fruit("watermelon");
        fruits[3] = new Fruit("pineapple");
        fruits[4] = new Fruit("lemon");

        Warehouse warehouse = new Warehouse(fruits);

        for (int i = 0; i < fruits.length * 2; i++) {
            Fruit nextFruit = warehouse.next();
            System.out.println(nextFruit);
        }

        Fruit[] array = warehouse.getArray();
        array[0] = new Fruit("hacker's attack");
        System.out.println(warehouse);
    }

}
