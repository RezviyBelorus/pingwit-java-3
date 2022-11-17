package org.example.lec_4.classwork.point_3;

public class Building {

     static int floor = 100;

    public Building() {
        System.out.println("Constructor");
        this.floor = 200;
    }

    {
        System.out.println("Non static block");
        this.floor = 400;
    }

    static {
        System.out.println("Static block");
        floor = 600;
    }
}
