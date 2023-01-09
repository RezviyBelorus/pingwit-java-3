package org.example.lec_11.practice.gladiator;

import java.util.Scanner;

public class GladiatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя игрока:");
        String gladiatorName = scanner.next();

        GladiatorComputerNameService nameService = new GladiatorComputerNameService();
        String computerName = nameService.generateName();

        System.out.println("Сейчас будет битва между " + gladiatorName + " vs " + computerName);

        System.out.println("Нажмите enter, если готовы начать битву!");
        String someRandomMessage = scanner.next();

        GladiatorFightService fightService = new GladiatorFightService();

        int health = 4;
        Gladiator userGladiator = new Gladiator(gladiatorName, health);
        Gladiator computerGladiator = new Gladiator(computerName, health);

        while (true) {
            System.out.println("Куда бьем?");
            System.out.println("""
                0. HIGH_KICK
                1. MIDDLE_KICK
                2. LOW_KICK
                 """);

            int attackIndex = scanner.nextInt();

            int injury = fightService.attack(attackIndex, computerGladiator);

            if (computerGladiator.getHealth() <= 0) {
                System.out.println("Битва окончена, вы победили!");
                break;
            }

            System.out.println("Какой блок поставите?");
            System.out.println("""
                0. HIGH_BLOCK
                1. MIDDLE_BLOCK
                2. LOW_BLOCK
                 """);

            int defendIndex = scanner.nextInt();
            int defend = fightService.defend(defendIndex, userGladiator);

            if (userGladiator.getHealth() <= 0) {
                System.out.println("Битва окончена, вы проиграли!");
                break;
            }
        }
    }

}
