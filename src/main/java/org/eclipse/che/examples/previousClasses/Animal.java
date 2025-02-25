package org.eclipse.che.examples;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight){
        this.name=name;
        this.brain=brain;
        this.body=body;
        this.size=size;
        this.weight=weight;
    }

    public void eat(){System.out.println("Animal eating");}
    public void move(int speed){
        System.out.println("Animal moving at " + speed);
    }

}