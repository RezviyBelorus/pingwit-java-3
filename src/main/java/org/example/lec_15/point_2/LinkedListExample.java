package org.example.lec_15.point_2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("Egorka");
        names.add("Olya");

        System.out.println(names.contains("Egorka"));
        System.out.println(names.contains("Test"));

        System.out.println(names.isEmpty());

        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
