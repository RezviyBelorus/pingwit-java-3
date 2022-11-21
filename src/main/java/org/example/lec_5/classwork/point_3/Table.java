package org.example.lec_5.classwork.point_3;

import java.util.Objects;

//immutable - only getters
public class Table {
    private static final String ID = "dfdfd";

    private String surface;
    private Integer legs;

    private String color;

    static {}

    {
        System.out.println();
    }

    public Table(String surface, Integer legs, String color) {
        this.surface = surface;
        this.legs = legs;
        this.color = color;
    }

    public String getSurface() {
        return surface;
    }

    public Integer getLegs() {
        return legs;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Table table = (Table) o;
        return Objects.equals(surface, table.surface) && Objects.equals(legs, table.legs) && Objects.equals(color, table.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surface, legs, color);
    }

}
