package org.eclipse.che.examples;

public class Vip {

    private String name;
    private double creditLimit;
    private String email;

    public Vip(){
        this("default name", 50000.00, "default@email.com");
    }

    public Vip(String name, double creditLimit){
        this(name, creditLimit, "default@email.com");
    }

    public Vip(String name, double creditLimit, String email){
        this.creditLimit=creditLimit;
        this.name=name;
        this.email=email;
    }
}