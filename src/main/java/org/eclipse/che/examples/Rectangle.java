package org.eclipse.che.examples;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = Math.max(0, width);
        this.length = Math.max(0, length);
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}