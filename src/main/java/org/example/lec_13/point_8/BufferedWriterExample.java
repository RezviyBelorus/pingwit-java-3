package org.example.lec_13.point_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/main/java/org/example/lec_13/point_8/buf_file_writer.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Helllo from point 8");

            bw.flush();
        } catch (IOException e) {

        }
    }

}
