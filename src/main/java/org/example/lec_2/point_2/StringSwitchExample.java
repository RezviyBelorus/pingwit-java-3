package org.example.lec_2.point_2;

public class StringSwitchExample {
    public static void main(String[] args) {
        String name = "Egorka ";

        switch (name) {
            case "Egorka" -> System.out.println("Privet, Egorka");
            case "Olya" -> System.out.println("Privet, Olya");
            default -> System.out.println("Idi sam...");
        }
    }
}
