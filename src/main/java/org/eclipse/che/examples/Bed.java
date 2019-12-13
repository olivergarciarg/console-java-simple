package org.eclipse.che.examples;

public class Bed {
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    private String style;

    public Bed(String style, int pillows, int height, int sheets, int quilt){
        this.height = height;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

}