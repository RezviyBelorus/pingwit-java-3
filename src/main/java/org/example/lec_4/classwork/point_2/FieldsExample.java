package org.example.lec_4.classwork.point_2;

public class FieldsExample {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 1976);

        mercedes.year = 2000;
//        mercedes.producer = "Brabus";

        System.out.println(mercedes);


        Car bmw = new Car();
        System.out.println("bmw=" + bmw);

        Car fiat = new Car("Fiat");
        fiat.year = 2022;
        System.out.println("fiat=" + fiat);


        Integer serialNumber = Car.VIN;

        System.out.println("fiat.getSerialNumber()=" + fiat.getSerialNumber());

        mercedes.setSerialNumber(666);

        System.out.println("fiat.getSerialNumber()=" + fiat.getSerialNumber());

        Integer serialNumber1 = bmw.VIN;

        Integer serialNumber2 = Car.VIN;
        Car.VIN = 1000;


        System.out.println("fiat.getSerialNumber()=" + fiat.getSerialNumber());
    }

}
