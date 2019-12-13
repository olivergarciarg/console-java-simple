package org.eclipse.che.examples;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = Math.max(0, radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}