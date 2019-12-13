package org.eclipse.che.examples;

public class Point {
    // write your code here
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

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

    public double distance(int x, int y){
        int newX = this.x - x;
        int newY = this.y - y;
        return Math.sqrt((newX * newX) + (newY * newY));
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(Point secondPoint){
        return distance(secondPoint.x, secondPoint.y);
    }
}