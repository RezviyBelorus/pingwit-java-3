package org.example.lec_5.classwork.point_3;

import org.example.lec_5.classwork.point_1.Dog;

public class TableMain {
    public static void main(String[] args) {
        // hasCode oakTable == woodTable -> equals возможно true
        // equals oakTable и woodTable  == true -> hasCode одинаковый

        Table oakTable = new Table("wood", 4, "RED");
        Table woodTable = new Table("wood", 5, "RED");

        Dog dog = new Dog("Sharik", "surname");

        System.out.println(oakTable.getSurface() == woodTable.getSurface());
        System.out.println(oakTable.getLegs() == woodTable.getLegs());
        System.out.println(oakTable.getColor() == woodTable.getColor());

        boolean equals = oakTable.equals(woodTable);

        System.out.println("equals=" + equals);
        System.out.println("oakTable == woodTable = " + (oakTable == woodTable));
        System.out.println("oakTable.hashCode() = " + oakTable.hashCode());
        System.out.println("woodTable.hashCode() = " + woodTable.hashCode());
        System.out.println(oakTable);
        System.out.println(woodTable);

        System.out.println(oakTable.equals(dog));


        Integer motherAge = 128;
        Integer fatherAge = 128;

        System.out.println("motherAge == fatherAge = " + motherAge.equals(fatherAge));
    }

}
