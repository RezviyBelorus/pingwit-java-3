package org.example.lec_13.point_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/java/org/example/lec_13/point_6/data.txt");
             DataInputStream dis = new DataInputStream(fis)) {

            boolean b_1 = dis.readBoolean();
            boolean b_2 = dis.readBoolean();
            Long number = dis.readLong();
            String text = dis.readUTF();

            System.out.println(b_1);
            System.out.println(b_2);
            System.out.println(number);
            System.out.println(text);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
