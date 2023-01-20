package org.example.lec_15.point_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("C");
        names.add("C");
        names.add("C");
        names.add("A");
        names.add("A");
        names.add("B");
        names.add("B");

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
