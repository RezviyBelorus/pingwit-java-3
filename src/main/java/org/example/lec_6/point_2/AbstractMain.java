package org.example.lec_6.point_2;

public class AbstractMain {
    public static void main(String[] args) {
        SmallDogAbstract smallDog = new Hua();

        smallDog.sleep();
        smallDog.wakeUp();


        SmallDogAbstract taksa = new Dachshund();
        taksa.sleep();
        taksa.wakeUp();


        /*
        class extends only 1 class
        class implements many interfaces
        interface extends many interfaces
         */
    }
}
