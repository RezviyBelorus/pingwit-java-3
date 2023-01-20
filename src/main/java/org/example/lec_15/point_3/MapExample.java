package org.example.lec_15.point_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, List<Student>> schoolClasses = new HashMap<>();
        schoolClasses.put(
            "1A",
            List.of(new Student("Egorka"), new Student("Olya"))
        );


        schoolClasses.put(
            "2B",
            List.of(new Student("Apelsinka"), new Student("Jakub"))
        );

        System.out.println(schoolClasses);

        schoolClasses.put(
            "1A",
            List.of(new Student("Egorka"))
        );

        System.out.println(schoolClasses);


        List<Student> students = schoolClasses.get("1A");
        System.out.println(students);

        System.out.println(schoolClasses.get("1B"));

        System.out.println(schoolClasses);
        System.out.println(schoolClasses.size());

        Set<String> classes = schoolClasses.keySet();

        for (String className : classes) {
            System.out.println(schoolClasses.get(className));
        }

        Set<Map.Entry<String, List<Student>>> entries = schoolClasses.entrySet();
        for (Map.Entry<String, List<Student>> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("=== New Class ===");
        }
    }

}
