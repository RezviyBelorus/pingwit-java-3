package org.example.lec_16.point_1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> smth = new TreeMap<>();

        smth.put("B", 1);
        smth.put("A", 3);
        smth.put("AB", 3);
        smth.put("Ab", 3);
        smth.put("bB", 4);

        System.out.println(smth);
    }
}
