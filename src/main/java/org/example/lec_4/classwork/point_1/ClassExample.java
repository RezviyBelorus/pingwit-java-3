package org.example.lec_4.classwork.point_1;

public class ClassExample {
    public static void main(String[] args) {
        int age;
        String name;

        Student student = new Student();

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.height);

        student.name = "Egorka";
        System.out.println(student.name);
        System.out.println(student);


        System.out.println("=== Oleg ===");
        Student oleg = new Student(32, "Oleg", 210);
        System.out.println(oleg.age);
        System.out.println(oleg.name);
        System.out.println(oleg.height);
        System.out.println(oleg);

        System.out.println("=== student = oleg ===");
        student = oleg;
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.height);
        System.out.println(student);


        System.out.println("=== change value ===");
        oleg.name = "Ded Oleg";
        System.out.println("student.name=" + student.name);
    }
}
