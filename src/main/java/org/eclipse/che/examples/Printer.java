package org.eclipse.che.examples;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer (int tonerLevel, boolean duplex){
        if (tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        int newTonerLevel = -1;
        if (tonerAmount >= 0 && tonerAmount <=100){
            if (this.tonerLevel + tonerAmount > 100){
                newTonerLevel = -1;
            } else {
                this.tonerLevel += tonerAmount;
                newTonerLevel = this.tonerLevel;
            }
        } else {
            newTonerLevel = -1;
        }
        return newTonerLevel;
    }

    public int print(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}