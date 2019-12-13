package org.eclipse.che.examples;

public class Player {
    public String name;
    public int health;
    public String weapon;

    /*
    public Player(String style, int pillows, int height, int sheets, int quilt){
        this.height = height;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }
    */

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}