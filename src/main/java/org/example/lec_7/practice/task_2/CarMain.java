package org.example.lec_7.practice.task_2;

import javax.swing.WindowConstants;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.engineOn();
        car.increaseSpeed();
        car.pressGas();

        car.ride();

        car.getCurrentSpeed();

        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.getCurrentSpeed();
    }
}
