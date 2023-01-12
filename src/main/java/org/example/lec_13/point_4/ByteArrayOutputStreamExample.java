package org.example.lec_13.point_4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            String message = "M Nice day";
            bos.write(message.getBytes());

            byte[] outputArray = bos.toByteArray();
            System.out.println(Arrays.toString(outputArray));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
