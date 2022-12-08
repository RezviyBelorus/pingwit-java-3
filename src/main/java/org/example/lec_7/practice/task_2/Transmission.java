package org.example.lec_7.practice.task_2;

public class Transmission {
    private static final int MAX_TRANSMISSION_GEAR = 7;
    private static final int MIN_TRANSMISSION_GEAR = 0;
    private static final int GEAR_SPEED_MULTIPLIER = 20;

    private int currentGear;
    private int currentSpeed;

    public int increaseSpeed() {
        if (currentGear == MAX_TRANSMISSION_GEAR) {
            System.out.println("Can't increase transmission speed");
            return currentGear;
        }

        currentGear = currentGear + 1;
        updateSpeed();

        return currentGear;
    }

    public int decreaseSpeed() {
        if (currentGear == MIN_TRANSMISSION_GEAR) {
            System.out.println("Can't decrease transmission speed");
            return currentGear;
        }

        currentGear = currentGear - 1;
        updateSpeed();

        return currentGear;
    }

    public boolean isFirstGear() {
        return currentGear == 1;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    private void updateSpeed() {
        currentSpeed = currentGear * GEAR_SPEED_MULTIPLIER;
    }

}
