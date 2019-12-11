package org.eclipse.che.examples;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println(porsche.getModel());
    }
}