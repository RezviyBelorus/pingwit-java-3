package org.example.lec_15.point_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> jackpotNumbers = new ArrayList<>(List.of(1, 3, 2));
        jackpotNumbers.add(1);
        System.out.println(jackpotNumbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("Olya");
        names.add("Olya");
        names.add("Egorka");
        names.add("Egorka");
        names.add("Olya");
        names.add("Egorka");
        names.add("Olya");

        names.add(0, "Valera");
        names.add(1, "Sveta");

        System.out.println(names);

//        names.remove(0);
//        names.remove("Olya");

        System.out.println(names);

//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//            if (name.equals("Olya")) {
//                names.remove(i);
//            }
//            System.out.println("i=" + i);
//        }

        List<String> tom = List.of("Tom", "Jack");

        names.addAll(tom);
        System.out.println(names);

        names.removeAll(List.of("Olya", "Egorka"));
        System.out.println(names);
//        names.add("Valera");
        System.out.println(names);

        names.retainAll(List.of("Valera", "Valera", "Sveta", "Tom", "Daniel"));
        System.out.println(names);
    }

}
