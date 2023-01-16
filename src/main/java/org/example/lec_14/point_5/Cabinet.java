package org.example.lec_14.point_5;

public class Cabinet<T> {
    private T[] things;

    public Cabinet(T[] things) {
        this.things = things;
    }

    public T[] getThings() {
        return things;
    }

    public void setThings(T[] things) {
        this.things = things;
    }

}
