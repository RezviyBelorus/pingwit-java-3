package org.example.lec_7.practice.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] ints = {11, 22, 33};

        printArrayRecursively(ints, 0);
    }

    private static void printArrayRecursively(int[] ints, int index) {
        if (index == ints.length) {
            return;
        }

        System.out.println(ints[index]);

        printArrayRecursively(ints, ++index);
    }

}
