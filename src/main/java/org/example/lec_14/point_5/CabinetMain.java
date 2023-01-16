package org.example.lec_14.point_5;

public class CabinetMain {
    public static void main(String[] args) {
        BuiltInCabinet<String> cabinet = new BuiltInCabinet<>(new String[]{"Azbuka"});

        Coupe coupe = new Coupe(new Trash[]{});
        Trash[] things = coupe.getThings();

        CornerCabinet<Toy, Shelf> cornerCabinet = new CornerCabinet<>(
            new Toy[] {},
            new Shelf[] {new Shelf()}
        );

        Shelf[] shelves = cornerCabinet.getShelves();

        CornerCabinet<Toy, WoodShelf> woodShelfCornerCabinet = new CornerCabinet<>(
            new Toy[] {},
            new WoodShelf[] {new WoodShelf()}
        );
        WoodShelf[] woodShelves = woodShelfCornerCabinet.getShelves();

    }
}
