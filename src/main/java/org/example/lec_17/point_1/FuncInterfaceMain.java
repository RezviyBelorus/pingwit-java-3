package org.example.lec_17.point_1;

public class FuncInterfaceMain {
    public static void main(String[] args) {
        FuncInterfaceExample funcInterface = () -> {
            System.out.println("===TRUE===");

            return true;
        };

        boolean test = funcInterface.test();

        System.out.println("Test result = " + test);
        System.out.println("Finish main");
    }
}
