package org.example.lec_6.practice.task_2;

import java.util.Arrays;

public class Warehouse {
    private final Fruit[] fruits;

    private int currentElement = -1;

    public Warehouse(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public Fruit next() {
        if (currentElement == fruits.length - 1) {
            currentElement = -1;
        }

        currentElement = currentElement + 1;
        return fruits[currentElement];
    }

    public Fruit[] getArray() {
        Fruit[] copy = new Fruit[fruits.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = fruits[i];
        }
        return copy;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
            "fruits=" + Arrays.toString(fruits) +
            '}';
    }

}
