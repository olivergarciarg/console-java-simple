package org.eclipse.che.s2;

public class Vehicle {

    private String name;
    private String size;
    private int velocity;
    private int direction;

    public Vehicle(String name, String size){
        this.name=name;
        this.size=size;
        this.velocity=0;
        this.direction=0;
    }

    public void steer(int direction){
        this.direction+=direction;
        System.out.println("Vehicle steering at " + direction);
    }

    public void move(int velocity, int direction){
        this.velocity=velocity;
        this.direction=direction;
        System.out.println("Vehicle moving at " + velocity + " in direction " + direction);
    }

    public void stop(){
        this.velocity=0;
    }

    public int getVelocity(){
        return this.velocity;
    }

    public int getDirection(){
        return this.direction;
    }


}