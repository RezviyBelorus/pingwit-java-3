package org.example.lec_13.point_2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        String filePath = "/Users/alexfomin/Desktop/pingwit/lectures/video/pingwit-java-3/src/main/java/org/example/lec_13/point_2/lady_gaga_bloody_mary.txt";
        String filePathAbsolute = "/Users/alexfomin/Desktop/pingwit/lectures/video/pingwit-java-3/src/main/java/org/example/lec_13/point_1/lady_gaga_bloody_mary.txt";

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);

            int data;

            while ((data = fis.read()) != -1) {
                System.out.println(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close(); // macos: cmd+option+b,  windows: ctrl+alt+b
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
