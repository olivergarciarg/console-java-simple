package org.eclipse.che.examples;

public class EnhancedPlayer {
    public String name;
    public int health;
    public String weapon;

    public EnhancedPlayer(String name, int health, String weapon){
        this.name = name;
        if (health>=0 && health <=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

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