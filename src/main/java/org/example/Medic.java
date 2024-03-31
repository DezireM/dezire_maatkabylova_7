package org.example;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic applied his super ability " + superAbilityType);
    }

    public void increaseExperience() {
        healPoints += healPoints*0.1;
    }
    public int getHealPoint(){
        return healPoints;
    }
}
