package org.example.lec_17.point_1;

//@FunctionalInterface
public interface FuncInterfaceExample {

    boolean test();

    default String generateMessage() {
        return "some message";
    }
}
