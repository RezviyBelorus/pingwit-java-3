package org.example.lec_5.classwork.point_1;

public class DogMain {
    public static void main(String[] args) {
        // dto = Data Transfer Object

        Dog dog = new Dog("Hati", "Koshkin");
        Dog hati = new Dog("Hati", "Koshkin");

        String fullName = dog.getFullName();

        System.out.println(fullName);

        Long id = Dog.getIdStatic();

        int abs = Math.abs(-100);
        System.out.println(abs);

        String stringNumber = "33";
        String stringSecondNumber = "33";

        Integer firstNumber = Integer.valueOf(stringNumber);
        Integer secondNumber = Integer.valueOf(stringSecondNumber);
        System.out.println(firstNumber + secondNumber);

    }
}
