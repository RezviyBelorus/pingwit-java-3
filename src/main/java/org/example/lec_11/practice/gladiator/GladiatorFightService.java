package org.example.lec_11.practice.gladiator;

import java.util.Random;

public class GladiatorFightService {

    private static final int DEFAULT_ATTACK_INJURY = 1;

    private final Random random = new Random();

    public int attack(int attackIndex, Gladiator gladiator) {
        int defendOptionRandomIndex = random.nextInt(DefendOption.values().length);

        if (attackIndex == defendOptionRandomIndex) {
            System.out.println("Сработал блок: " + DefendOption.values()[defendOptionRandomIndex]);
            return 0;
        } else {
            int currentHealth = gladiator.getHealth() - DEFAULT_ATTACK_INJURY;
            gladiator.setHealth(currentHealth);

            System.out.println("Вы нанесли успешный удар, компьютер не смог отразить атаку: " + DefendOption.values()[defendOptionRandomIndex]);

            return DEFAULT_ATTACK_INJURY;
        }
    }

    public int defend(int defendIndex, Gladiator gladiator) {
        int attackOptionRandomIndex = random.nextInt(AttackOption.values().length);

        if (defendIndex == attackOptionRandomIndex) {
            System.out.println("Сработал блок, удар компьютера: " + AttackOption.values()[attackOptionRandomIndex]);
            return 0;
        } else {
            int currentHealth = gladiator.getHealth() - DEFAULT_ATTACK_INJURY;
            gladiator.setHealth(currentHealth);

            System.out.println("Вы не смогли отразить удар, компьютер нанес урон атакой: " + AttackOption.values()[attackOptionRandomIndex]);

            return DEFAULT_ATTACK_INJURY;
        }
    }

}
