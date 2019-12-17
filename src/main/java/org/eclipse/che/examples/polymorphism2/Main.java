package org.eclipse.che.examples;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return this.name;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsu extends Car {
    public Mitsu (int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Mitsu -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitsu -> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitsu -> brake()";
    }
}

class Ford extends Car {
    public Ford (int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }

    @Override
    public String brake(){
        return "Ford -> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "basic");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        Mitsu outlander = new Mitsu(4, "4WD");
        System.out.println(outlander.startEngine());
        System.out.println(outlander.accelerate());
        System.out.println(outlander.brake());
        Ford focus = new Ford(4, "4WD");
        System.out.println(focus.startEngine());
        System.out.println(focus.accelerate());
        System.out.println(focus.brake());
    }
}