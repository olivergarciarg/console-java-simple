package org.eclipse.che.examples;

public class Floor {

    private double width;
    private double length;

    public Floor(){
        this(0,0);
    }

    public Floor(double width, double length){
        this.width=Math.max(0,width);
        this.length=Math.max(0,length);
    }

    public double getArea(){
        return this.length * this.width;
    }
}