package org.example.lec_15.point_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            numbers.remove(0);
            Integer next = iterator.next();

            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);

//        for (Integer number : numbers) {
//            numbers.remove(0);
//        }
    }

}
