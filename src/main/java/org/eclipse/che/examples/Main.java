package org.eclipse.che.examples;

public class Main {

    public static void main(String[] args) {
        Printer printer  = new Printer(50, true);
        System.out.println("initial page count= " + printer.getPagesPrinted());
        int pagesPrinted = printer.print(4);
        System.out.println("pages printed " + pagesPrinted + " , total pages printed " + printer.getPagesPrinted());
        pagesPrinted = printer.print(2);
        System.out.println("pages printed " + pagesPrinted + " , total pages printed " + printer.getPagesPrinted());
    }
}