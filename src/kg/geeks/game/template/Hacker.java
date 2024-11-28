package kg.geeks.game.template;

import java.util.Random;

public class Hacker extends Hero{
    private int stealHealth = 50;
    private int roundCounter = 0;

    public Hacker(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.STEAL_HEALTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        roundCounter++;
        if(roundCounter % 2 == 0){
            if(boss.getHealth() > stealHealth){
                boss.setHealth(boss.getHealth() - stealHealth);
                for (Hero hero : heroes) {
                    if(hero.getHealth() > 0) {
                        hero.setHealth(hero.getHealth() + stealHealth);
                        System.out.println(getName() + " steal " + stealHealth + " health from the boos and handed it over " + hero.getName());
                        break;
                    }
                }
            }
        }else{
            System.out.println(getName() + " don't steal in this round");
        }

    }
}
