package org.eclipse.che.examples;

public class Hamburger{
    private String name;
    private String meat;
    private Double price;
    private String breadRollType;

    private String addition1Name;
    private Double addition1Price;

    private String addition2Name;
    private Double addition2Price;

    private String addition3Name;
    private Double addition3Price;

    private String addition4Name;
    private Double addition4Price;

    public Hamburger(String name, String meat, Double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println("base price is " + this.price);
        if(this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println(this.addition1Name + " added price " + this.addition1Price);
        }
        if(this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println(this.addition2Name + " added price " + this.addition2Price);
        }
        if(this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println(this.addition3Name + " added price " + this.addition3Price);
        }
        if(this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println(this.addition4Name + " added price " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}