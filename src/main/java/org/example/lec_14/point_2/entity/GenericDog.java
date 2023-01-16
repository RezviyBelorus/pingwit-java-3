package org.example.lec_14.point_2.entity;

public class GenericDog implements GenericAnimal {

    private String name;

    public GenericDog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
