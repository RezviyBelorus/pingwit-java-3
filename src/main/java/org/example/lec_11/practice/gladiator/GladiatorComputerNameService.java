package org.example.lec_11.practice.gladiator;

import java.util.Random;

public class GladiatorComputerNameService {

    private final Random random = new Random();

    public String generateName() {
        GladiatorComputerName[] names = GladiatorComputerName.values();

        int index = random.nextInt(names.length);

        return names[index].name();
    }
}
