package org.eclipse.che.examples;

public class Lamp {
    private boolean battery;
    private int globRating;
    private String style;

    public Lamp(boolean battery, int globRating, String style){
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
}