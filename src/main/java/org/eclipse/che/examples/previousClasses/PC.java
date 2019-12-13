package org.eclipse.che.examples;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        this.theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        this.monitor.drawPixelAt(1200, 50, "yellow");
    }

    public Case getTheCase(){
        return this.theCase;
    }

    public Monitor getMonitor(){
        return this.monitor;
    }

    public Motherboard getMotherboard(){
        return this.motherboard;
    }
}