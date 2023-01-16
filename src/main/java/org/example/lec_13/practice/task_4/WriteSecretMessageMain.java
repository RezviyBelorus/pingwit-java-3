package org.example.lec_13.practice.task_4;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteSecretMessageMain {
    public static void main(String[] args) {
        String path = "src/main/java/org/example/lec_13/practice/task_4/pinguin.png";

        String secretMessage = "Penguins can't fly";

        try (FileOutputStream fos = new FileOutputStream(path, true)) {
            fos.write(secretMessage.getBytes());
            fos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
