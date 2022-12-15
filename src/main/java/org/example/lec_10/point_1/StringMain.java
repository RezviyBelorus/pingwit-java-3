package org.example.lec_10.point_1;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        String name = "   Egorka";

        name = name.concat(" Pushkin   ");
        System.out.println(name);

        System.out.println(name.length());
        name = name.trim();
        System.out.println(name.length());
        System.out.println(name);

        System.out.println(name.startsWith("Egorka"));
        System.out.println(name.startsWith("Pushkin", 7));

        System.out.println("shkin=" + name.endsWith("shkin"));


        name = name + "E";
        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("E", 1)); // Egorka PushkinE [0..3) -> 0,1,2

        int lastIndex = 0;
        for (int i = 0; i < name.length(); i++) {
            lastIndex = name.indexOf("E", lastIndex);
            System.out.println(lastIndex);
            i = i + lastIndex;

            lastIndex++;

            System.out.println("i=" + i);
        }


        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.contains("Egorka"));


        String[] fullName = name.split("a");
        System.out.println(Arrays.toString(fullName));


        System.out.println(name);
        System.out.println(name.replace("E", "**"));
        System.out.println(name.replaceAll("\\w", "**"));

        System.out.println("   1  ".isBlank());
        System.out.println("".isEmpty());
    }

}
