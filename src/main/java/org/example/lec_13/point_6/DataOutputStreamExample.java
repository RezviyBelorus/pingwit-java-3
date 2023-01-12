package org.example.lec_13.point_6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/main/java/org/example/lec_13/point_6/data.txt", true);
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeBoolean(true);
            dos.writeLong(666);
            dos.writeUTF("Some data");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
