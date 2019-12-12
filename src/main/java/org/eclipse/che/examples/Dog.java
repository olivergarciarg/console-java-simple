package org.eclipse.che.examples;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){System.out.println("Dog chewing");}

    public void walk(){
        System.out.println("Dog walking");
        move(5);
    }

    public void run(){
        System.out.println("Dog runing");
        move(10);
    }

    @Override
    public void eat(){
        System.out.println("Dog eating");
        chew();
        super.eat();
    }

    private void moveLegs(int speed){
        System.out.println("Dog moving legs");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog moving");
        moveLegs(speed);
        super.move(speed);
    }



}