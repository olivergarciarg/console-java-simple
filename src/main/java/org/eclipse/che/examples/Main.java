package org.eclipse.che.examples;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name="tim";
        player.health=20;
        player.weapon="Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining health is " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("remaining health is " + player.healthRemaining());
    }
}