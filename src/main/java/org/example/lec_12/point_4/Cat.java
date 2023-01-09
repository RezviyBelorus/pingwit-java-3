package org.example.lec_12.point_4;

public class Cat implements Animal {
    @Override
    public void eat() throws AnimalException {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() throws Error {

    }

}
