package org.example.lec_12.point_3;

public class HomeworkExceptionExample {
    public static void main(String[] args) {
        GladiatorHomework gladiatorHomework = new GladiatorHomework();

        try {
            gladiatorHomework.doWork();
        } catch (HomeworkException e) {
            System.out.println("Мы получилось сделать домашку, прастити");
        }
    }
}
