package org.example.lec_13.point_4;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] bytes = new byte[] {1, 10, 127};

        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes)) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.println(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
