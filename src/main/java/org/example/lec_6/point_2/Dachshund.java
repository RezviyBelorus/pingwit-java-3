package org.example.lec_6.point_2;

import org.example.lec_6.point_1.AmericanDog;
import org.example.lec_6.point_1.Dog;

public final class Dachshund extends SmallDogAbstract implements AmericanDog, Dog {

    @Override
    public void wakeUp() {
        System.out.println("Dachshund is waking up");
    }

    @Override
    public void doCommand(String command) {

    }

    @Override
    public boolean hasVoice() {
        return false;
    }

    //    @Override
//    void sleep() {
//        System.out.println("Hahaha, ya hacker");
//    }

}
