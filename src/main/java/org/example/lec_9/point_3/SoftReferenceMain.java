package org.example.lec_9.point_3;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class SoftReferenceMain {
    public static void main(String[] args) {
        SoftReference<List<String>> softReference = new SoftReference<>(new ArrayList<>());

        Long counter = 0L; // 31151587

        while (true) {
            List<String> strings = softReference.get();
            String name = "Diana";
            strings.add(name);

            counter++;
            System.out.println(counter);
        }
    }
}
