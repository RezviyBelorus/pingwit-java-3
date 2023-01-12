package org.example.lec_13.point_10;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/example/lec_13/point_10");

        File[] files = file.listFiles();

        for (File elem : files) {
            System.out.println(elem);
        }
    }
}
