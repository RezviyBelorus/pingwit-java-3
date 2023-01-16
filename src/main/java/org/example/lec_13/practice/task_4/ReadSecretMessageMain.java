package org.example.lec_13.practice.task_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadSecretMessageMain {
    public static void main(String[] args) {
        String path = "src/main/java/org/example/lec_13/practice/task_4/pinguin.png";

        int secretMessageLength = "Penguins can't fly".length();

        File file = new File(path);
        long length = file.length();

        try (FileInputStream fis = new FileInputStream(path)) {

            fis.skipNBytes(fis.available() - secretMessageLength);
            byte[] message = fis.readAllBytes();

            for (int i = 0; i < message.length; i++) {
                System.out.print((char) message[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
