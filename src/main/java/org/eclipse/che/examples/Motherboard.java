package org.eclipse.che.examples;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("program " + programName + " loading");
    }
}