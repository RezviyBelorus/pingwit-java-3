package org.example.lec_1.point_5;

public class TypeCasting {
    public static void main(String[] args) {
        int myInt = -735;

        byte myByte = (byte) myInt; // 513 - 256 = 1

        System.out.println(myByte);

        double myDouble = 100.56;

        myInt = (int) myDouble;

        System.out.println(myInt);

        byte page = 5;

        int result = myByte + page;

        long width = 100;
        long height = 200;
        myDouble = myDouble - result;
    }
}
