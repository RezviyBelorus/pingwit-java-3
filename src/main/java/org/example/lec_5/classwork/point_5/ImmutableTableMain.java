package org.example.lec_5.classwork.point_5;

public class ImmutableTableMain {
    public static void main(String[] args) {
        ImmutableTable oak = new ImmutableTable("oak", 5, "RED");
        ImmutableTable wood = new ImmutableTable("oak", 5, "RED");

        System.out.println(oak);
        System.out.println(wood);


        System.out.println(oak.equals(wood));
        System.out.println(oak.displayName());
    }
}
