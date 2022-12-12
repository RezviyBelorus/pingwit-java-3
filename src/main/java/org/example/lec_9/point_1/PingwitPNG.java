package org.example.lec_9.point_1;

public class PingwitPNG extends AbstractPicture {

    private static final int SIZE_COEFFICIENT = 100;
    private static final String PICTURE_TYPE = "PNG";

    public PingwitPNG(Double width) {
        super(width);
    }

    @Override
    public Double getWidth() {
        double width = super.getWidth();

        return width * SIZE_COEFFICIENT;
    }

    @Override
    public String getPictureType() {
        return PICTURE_TYPE;
    }

}
