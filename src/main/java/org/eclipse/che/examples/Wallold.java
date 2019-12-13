package org.eclipse.che.examples;

public class Wall {

    private double width;
    private double height;

    public Wall(){
        this(0,0);
    }

    public Wall(double width, double height){
        this.width=Math.max(0,width);
        this.height=Math.max(0,height);
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width=Math.max(0,width);
    }

    public void setHeight(double height){
        this.height=Math.max(0,height);
    }

    public double getArea(){
        return this.height * this.width;
    }
}