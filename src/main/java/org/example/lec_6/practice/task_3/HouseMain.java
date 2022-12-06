package org.example.lec_6.practice.task_3;

public class HouseMain {
    public static void main(String[] args) {
        House panel = new Panel(100, true, 6666);
        House panelCenter = new Panel(100, true, 6666);
        House panelCorner = new Panel(100, true, 6666);
        House townhouse = new Townhouse(2, true, 5);

        House[] houses = new House[4];
        houses[0] = panel;
        houses[1] = townhouse;
        houses[2] = panelCenter;
        houses[3] = panelCorner;

        HouseCatalog houseCatalog = new HouseCatalog(houses);
    }
}
