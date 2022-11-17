package org.example.lec_4.classwork.point_4;

public class Fox {
    String color;
    int age;

    Fox(String color) {
        this.color = color;
    }

    public String toString() {
        String fox = "[color=" + color + "]";

        return fox;
    }


//    @Override
//    public String toString() {
//        return "Fox{" +
//            "color='" + color + '\'' +
//            ", age=" + age +
//            '}';
//    }

}
