package org.example.lec_6.point_1;

public interface Dog {
    public static final boolean HAS_NAME = true;

    boolean hasVoice();

    default void pee() {
        System.out.println("Vijy derevo, ne vijy pregrag");
    }

}
