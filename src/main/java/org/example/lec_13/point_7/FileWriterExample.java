package org.example.lec_13.point_7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/example/lec_13/point_7/file_writer_output.txt");

        try (FileWriter fr = new FileWriter(file, true)) {
            char[] data = new char[4];

            fr.write("Good evening");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
