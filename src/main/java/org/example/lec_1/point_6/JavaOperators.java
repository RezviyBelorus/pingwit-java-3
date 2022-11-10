package org.example.lec_1.point_6;

import java.math.BigDecimal;

public class JavaOperators {
    public static void main(String[] args) {
        /*
        int = Integer
        long = Long
        char = Character
        boolean = Boolean
        */

        byte ageCat = 100;
        byte ageDog = 100;

        int totalAge = ageCat + ageDog;

        long ageFox = 100;

        long superTotalAge = totalAge + ageFox;

        double width = 1.45;
        double height = 1.57;

        double halfPer = width + height;
        System.out.println(halfPer);


        int myInt = 0;
        Integer myInteger = 0;
        Long myLong = 0l;

        long sum = myInteger + myInteger + myLong;

        System.out.println(3 / 2);
        System.out.println(4.3 / 2);


//        System.out.println(3 / 0);
//        System.out.println(0.0 / 3);

        System.out.println(0 * 0);

        System.out.println(5 % 4);
        System.out.println(4 % 5);
        System.out.println(6 % 2 == 0);

        System.out.println("3 < 5 = " + (3 < 5));
        System.out.println("3 > 5 = " + (3 > 5));
        System.out.println("3 >= 5 = " + (3 >= 5));
        System.out.println("3 <= 5 = " + (3 <= 5));
        System.out.println("3 <= 5 = " + (3 <= 5));
        System.out.println("3 == 5 = " + (3 == 5));
        System.out.println("3 != 5 = " + (3 != 5));

        System.out.println("8 << 3 = " + (8 << 3));
        System.out.println("8 >> 3 = " + (8 >> 32));

        int increment = 0;
        increment = increment + 1;
        increment += 1;
        System.out.println("increment = " + increment);

        increment++;
        ++increment;

        System.out.println(increment); //4
        System.out.println(increment);
        System.out.println(++increment); //4
    }

}
