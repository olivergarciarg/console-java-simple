package org.eclipse.che.examples;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int eyes, int gills, int fins){
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.gills=gills;
        this.fins=fins;
    }

    private void rest(){System.out.println("Dog chewing");}

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    public void moveMuscles(){

    }

    public void moveBackFin(){

    }
}