package org.example.lec_7.practice.task_2;

public class Motor {

    private boolean on;

    public void engineOn() {
        if (on) {
            System.out.println("Motor is already on");
        } else {
            this.on = true;
        }
    }

    public void engineOff() {
        if (on) {
            this.on = false;
        } else {
            System.out.println("Motor is already off");
        }
    }

    public boolean isOn() {
        return on;
    }

}
