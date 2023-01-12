package org.example.lec_13.point_7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/example/lec_13/point_7/lady_gaga_bloody_mary.txt");

        try (FileReader fr = new FileReader(file)) {
            char[] data = new char[4];

            int length;
            while ((length = fr.read(data)) != -1) {
                for (int i = 0; i < length; i++) {
                    System.out.print(data[i]);
                }
//
//                for (char elem : data) {
//                    System.out.print(elem);
//                }

//                System.out.println();

                /*
                1 2 3 4 5 6
                [0,0,0,0]
                [1,2,3,4]
                [5,6,3,4]
                 */
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
