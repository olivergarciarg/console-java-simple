package org.eclipse.che.examples;

public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car (String name, String size, int wheels, int doors, int gears, boolean isManual){
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Velocity changed to " + speed + " direction " + direction);
    }

    /*
    @Override
    public void stop(){
        super.stop();
    }
    */

}