package org.example.lec_11.practice.gladiator;

public enum AttackOption {
    HIGH_KICK(0),
    MIDDLE_KICK(1),
    LOW_KICK(2);

    private int index;

    AttackOption(int index) {
        this.index = index;
    }
}
