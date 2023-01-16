package org.example.lec_14.point_2;

public class GenericWarehouse<T> {
    private T[] data;

    public GenericWarehouse(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

}
