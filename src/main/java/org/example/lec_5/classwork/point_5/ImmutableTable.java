package org.example.lec_5.classwork.point_5;

public record ImmutableTable(String surface, Integer legs, String color) {

    public String displayName() {
        return surface + " type random";
    }
}
