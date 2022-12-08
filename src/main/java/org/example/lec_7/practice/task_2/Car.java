package org.example.lec_7.practice.task_2;

public class Car { // Vehicle
    private Motor motor;
    private Transmission transmission;
    private boolean gas;

    public Car() {
        this.motor = new Motor();
        this.transmission = new Transmission();
    }

    public void ride() {
        if (motor.isOn() && transmission.isFirstGear() && gas) {
            System.out.println("Go-go-go");
        } else {
            System.out.println("Something goes wrong");
        }
    }

    public void engineOn() {
        motor.engineOn();
    }

    public void engineOff() {
        motor.engineOff();
    }

    public int increaseSpeed() {
        return transmission.increaseSpeed();
    }

    public int decreaseSpeed() {
        return transmission.decreaseSpeed();
    }

    public boolean pressGas() {
        gas = true;
        return gas;
    }

    public void getCurrentSpeed() {
        System.out.println(transmission.getCurrentSpeed());
    }

}
