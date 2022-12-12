package org.example.lec_9.point_1;

public class PingwitJPEG extends AbstractPicture {
    private static final String PICTURE_TYPE = "JPEG";

    public PingwitJPEG(Double width) {
        super(width);
    }

    @Override
    public String getPictureType() {
        return PICTURE_TYPE;
    }

}
