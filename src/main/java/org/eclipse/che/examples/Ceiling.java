package org.eclipse.che.examples;

public class Ceiling {
    private int height;
    private String color;

    public Ceiling(int height, String color){
        this.height = height;
        this.color = color;
    }

    public int getHeight(){
        return this.height;
    }

    public String getColor(){
        return this.color;
    }
}