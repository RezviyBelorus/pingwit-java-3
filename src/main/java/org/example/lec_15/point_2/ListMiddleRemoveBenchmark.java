package org.example.lec_15.point_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMiddleRemoveBenchmark {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        fill(arrayList);

        long start = System.currentTimeMillis();
        removeMiddle(arrayList);
        long finish = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (finish - start));

        List<Integer> linkedList = new LinkedList<>();
        fill(linkedList);

        long startLinkedList = System.currentTimeMillis();
        removeMiddle(linkedList);
        long finishLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (finishLinkedList - startLinkedList));
    }

    private static void fill(List<Integer> list) {
        int quantity = 500_000;
        for (int i = 0; i < quantity; i++) {
            list.add(i);
        }
    }

    private static void removeMiddle(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(list.size() / 2);
        }
    }
}
