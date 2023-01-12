package org.example.lec_13.point_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopySongExample {
    private static final String FILE_INPUT_PATH = "src/main/java/org/example/lec_13/point_1/lady_gaga_bloody_mary.txt";
    private static final String FILE_OUTPUT_PATH = "src/main/java/org/example/lec_13/point_1/output_song.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_INPUT_PATH);
             FileOutputStream fos = new FileOutputStream(FILE_OUTPUT_PATH)) {
            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
