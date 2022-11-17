package org.example.lec_4.classwork.point_2;

public class Car {

    static Integer VIN = 777;
    final String producer;
    Integer year = 44;

    public Car(String producer, Integer year) {
        this.producer = producer;
        this.year = year;
    }

    public Car(String producer) {
        this.producer = producer;
    }

    public Car() {
        this("Default producer", 2022);
        year = 2030;
    }

    @Override
    public String toString() {
        return "Car{" +
            "producer='" + producer + '\'' +
            ", year=" + year +
            '}';
    }

    Integer getSerialNumber() {
        return VIN;
    }

    void setSerialNumber(Integer number) {
        VIN = number;
    }

}
