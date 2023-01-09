package org.example.lec_12.point_4;

public class InterfaceExceptionExample {
    public static void main(String[] args) throws AnimalException {
        Animal animal = new Cat();

//        animal.eat();


        Cat cat = new Cat();
        cat.eat();
    }
}
