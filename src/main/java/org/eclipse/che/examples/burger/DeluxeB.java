package org.eclipse.che.examples;

public class DeluxeB extends Hamburger{
    private String healthyAdd1Name;
    private Double healthyAdd1Price;

    private String healthyAdd2Name;
    private Double healthyAdd2Price;

    public DeluxeB(){
        super("healthy", "sausage and bacon", 14.54, "White");
        super.addAddition1("chips", 2.75);
        super.addAddition2("drink", 1.81);
    }

    @Override
    public void addAddition1(String name, double price){
        System.out.println("NOPE");
    }

    @Override
    public void addAddition2(String name, double price){
        System.out.println("NOPE");
    }

    @Override
    public void addAddition3(String name, double price){
        System.out.println("NOPE");
    }

    @Override
    public void addAddition4(String name, double price){
        System.out.println("NOPE");
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