package org.example.lec_2.point_2;

public class SwitchExample {
    public static void main(String[] args) {
        int month = 14;

        switch (month) {
            case 11:
                System.out.println("November");
                System.out.println("November-2");
                break;
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Takogo mesyaca nety");
                break;
        }

        switch (month) {
            case 11 -> {
                System.out.println("November");
                System.out.println("November-2");
            }
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            default -> System.out.println("Takogo mesyaca nety");
        }



        System.out.println("Happy end");
    }
}
