package org.example.lec_3.classwork.point_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("How old are you?");
        Integer age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);

        System.out.println("Insert size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println(Arrays.toString(array));

        // git pull
    }
}
