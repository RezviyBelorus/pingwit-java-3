package org.example.lec_5.classwork.point_1;

public class Dog {

    static Long ID = 777L;

    String name;
    String surname;

    public Dog(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getFullName() {
        return name + " " + surname;
    }

    static Long getIdStatic() {
        return ID;
    }

}
