package org.example.lec_12.point_2;

import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {

        String name = getName();

        System.out.println(name);

        System.out.println("Программа завершает работу");
    }

    private static String getName() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            int num_1 = scanner.nextInt();

            System.out.println("Введите второе число:");
            int num_2 = scanner.nextInt();

            System.out.println("Результат деления: " + (num_1 / num_2));
        } catch (Exception e) {
            System.out.println("Упс, что-то пошло не так");

            return "Egorka";
        } finally {
            System.out.println("Отойдите подальше от экран, я сейчас выключусь");

            return "FinallyEgorka";
        }
    }

}
