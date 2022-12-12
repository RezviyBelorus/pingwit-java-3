package org.example.lec_9.point_1;

public abstract class AbstractPicture implements Picture{

    private Double width;

    public AbstractPicture(double width) {
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }
}
