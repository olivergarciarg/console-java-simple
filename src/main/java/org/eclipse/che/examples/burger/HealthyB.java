package org.eclipse.che.examples;

public class HealthyB extends Hamburger{
    private String healthyAdd1Name;
    private Double healthyAdd1Price;

    private String healthyAdd2Name;
    private Double healthyAdd2Price;

    public HealthyB(String meat, Double price){
        super("healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAdd1(String name, double price){
        this.healthyAdd1Name = name;
        this.healthyAdd1Price = price;
    }

    public void addHealthyAdd2(String name, double price){
        this.healthyAdd2Name = name;
        this.healthyAdd2Price = price;
    }

    @Override
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        System.out.println("H base price is " + hamburgerPrice);
        if(this.healthyAdd1Name != null){
            hamburgerPrice += this.healthyAdd1Price;
            System.out.println(this.healthyAdd1Name + " added price " + this.healthyAdd1Price);
        }
        if(this.healthyAdd2Name != null){
            hamburgerPrice += this.healthyAdd2Price;
            System.out.println(this.healthyAdd2Name + " added price " + this.healthyAdd2Price);
        }
        return hamburgerPrice;
    }
}