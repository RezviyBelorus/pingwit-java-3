package org.example.lec_14.point_5;

public class CornerCabinet<T, E extends Shelf> extends Cabinet<T> {

    private E[] shelves;

    public CornerCabinet(T[] things, E[] shelves) {
        super(things);
        this.shelves = shelves;
    }

    public E[] getShelves() {
        return shelves;
    }

}
