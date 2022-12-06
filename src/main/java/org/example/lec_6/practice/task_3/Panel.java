package org.example.lec_6.practice.task_3;

public class Panel implements House {

    private int floors;
    private boolean heating;
    private int residentsCount;

    public Panel(int floors, boolean heating, int residentsCount) {
        this.floors = floors;
        this.heating = heating;
        this.residentsCount = residentsCount;
    }

    @Override
    public int getFloors() {
        return floors;
    }

    @Override
    public boolean enableHeating() {
        return heating;
    }

    @Override
    public int getResidentsCount() {
        return residentsCount;
    }

}
