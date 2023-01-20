package org.example.lec_15.point_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapStudentExample {
    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<>();

        Student egorka = new Student("Egorka");

        Student egorkaCopy = new Student("Egorka");

        students.put(egorka, 25);
        System.out.println(students);

        Integer age = students.get(egorkaCopy);
        System.out.println(age);

        egorka.setName("Egorka F");

        System.out.println(students.get(egorkaCopy));

        students.put(new Student("Olya"), 24);
        Collection<Integer> values = students.values();
        System.out.println(values);

//        students.key
    }

}
