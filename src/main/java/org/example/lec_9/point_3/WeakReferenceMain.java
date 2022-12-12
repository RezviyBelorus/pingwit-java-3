package org.example.lec_9.point_3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class WeakReferenceMain {
    public static void main(String[] args) {
        WeakReference<List<String>> weakReference = new WeakReference<>(new ArrayList<>());

        Long counter = 0L; // 31151587

        while (true) {
            List<String> strings = weakReference.get();

            if (strings == null) {
                weakReference = new WeakReference<>(new ArrayList<>());
            } else {
                String name = "Diana";
                strings.add(name);
            }
            counter++;
            System.out.println(counter);
        }
    }

}
