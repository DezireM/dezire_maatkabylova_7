package org.example;

public class Main {
    public static void main(String[] args) {

        Hero[] heroes = {new Magic(200,20,"Invisibility"),
                new Medic(100,25,"Healing"),
                new Warrior(50,30,"Critical damage") };
        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
