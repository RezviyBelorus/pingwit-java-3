package org.example.lec_11.point_1;

public class Lego {

    @NotEmpty
    @Quantity(min = 5, max = 30)
    private String type;

    @Quantity(min = 5, max = 30)
    private Integer elementsQuantity;

    @NotEmpty
    private String serial;


    public Lego(String type, Integer elementsQuantity, String serial) {
        this.type = type;
        this.elementsQuantity = elementsQuantity;
        this.serial = serial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getElementsQuantity() {
        return elementsQuantity;
    }

    public void setElementsQuantity(Integer elementsQuantity) {
        this.elementsQuantity = elementsQuantity;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
