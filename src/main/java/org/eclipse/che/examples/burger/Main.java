package org.eclipse.che.examples;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addAddition1("tomato", 0.27);
        hamburger.addAddition2("lettuce", 0.75);
        hamburger.addAddition3("cheese", 1.12);
        price = hamburger.itemizeHamburger();
        System.out.println(price);

        HealthyB healthyB = new HealthyB("Bacon", 5.67);
        healthyB.itemizeHamburger();
        healthyB.addAddition1("egg", 5.43);
        healthyB.addHealthyAdd1("lentils", 3.41);
        System.out.println(healthyB.itemizeHamburger());
        //healthyB.addAddition1("egg", 5.43);

        DeluxeB deluxeB = new DeluxeB();
        System.out.println(deluxeB.itemizeHamburger());
    }
}