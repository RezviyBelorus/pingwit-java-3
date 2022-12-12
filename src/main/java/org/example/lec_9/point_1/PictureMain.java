package org.example.lec_9.point_1;

public class PictureMain {
    public static void main(String[] args) {
        Picture abstractPicture = generatePicture();

        Double width = abstractPicture.getWidth();

        System.out.println(width);

        String pictureType = abstractPicture.getPictureType();
        System.out.println(pictureType);

        int age = 18;
        String name = "name";
    }

    private static Picture generatePicture() {
        return new PingwitJPEG(100.5);
    }
}
