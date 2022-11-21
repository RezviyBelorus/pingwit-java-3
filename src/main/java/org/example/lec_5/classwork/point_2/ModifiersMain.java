package org.example.lec_5.classwork.point_2;

public class ModifiersMain {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();

        System.out.println(modifiers.getName());
        modifiers.setName("Egorka");
        System.out.println(modifiers.getName());
    }
}
