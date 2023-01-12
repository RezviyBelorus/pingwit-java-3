package org.example.lec_13.point_2;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        String filePath = "/Users/alexfomin/Desktop/pingwit/lectures/video/pingwit-java-3/src/main/java/org/example/lec_13/point_2/lady_gaga_bloody_mary.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
