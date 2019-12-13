package org.eclipse.che.examples;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");
        Ceiling ceiling = new Ceiling(12, "white");
        Bed bed = new Bed("modern", 2, 2, 2, 2);
        Lamp lamp = new Lamp(false, 75, "classic");
        Bedroom bedroom = new Bedroom("main", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
    }
}