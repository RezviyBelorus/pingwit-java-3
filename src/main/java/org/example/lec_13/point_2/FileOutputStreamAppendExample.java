package org.example.lec_13.point_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamAppendExample {

    private static final String FILE_PATH = "src/main/java/org/example/lec_13/point_1/message.txt";

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            fos.write(FILE_PATH.getBytes());
            fos.write("\n".getBytes());
            fos.write("\t".getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
