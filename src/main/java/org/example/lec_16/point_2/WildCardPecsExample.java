package org.example.lec_16.point_2;

import java.util.ArrayList;
import java.util.List;

public class WildCardPecsExample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());

//        pets.addAll(animals);
//        animals.add(pets); // List<Pet> !extends List<Animal>

        animals.add(new Pet()); // Pet extends Animal

        // PECS -> producer extends, consumer super

        addAll(animals, animals);
        addAll(pets, animals);

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void addAll(List<? extends Animal> from, List<? super Animal> to) {
        Animal animal = from.get(0);

        to.addAll(from);
        Object object = to.get(0);
    }
}
