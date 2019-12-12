package org.eclipse.che.examples;

public class Point {

    private int x;
    private int y;

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public double getArea(){
        return this.height * this.width;
    }
}