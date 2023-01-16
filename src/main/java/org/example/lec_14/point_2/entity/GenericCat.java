package org.example.lec_14.point_2.entity;

public class GenericCat implements GenericAnimal {

    private String name;

    public GenericCat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void sayHi() {
        System.out.println("Hello");
    }
}
