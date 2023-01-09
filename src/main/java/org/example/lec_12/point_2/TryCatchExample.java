package org.example.lec_12.point_2;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое число:");
            int num_1 = scanner.nextInt();

            System.out.println("Введите второе число:");
            int num_2 = scanner.nextInt();

            System.out.println("Результат деления: " + (num_1 / num_2));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (Exception e) {
            System.out.println("Упс, что-то пошло не так");
        }
    }

}
