package org.example.lec_13.point_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/java/org/example/lec_13/point_7/lady_gaga_bloody_mary.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e) {

        }
    }

}
