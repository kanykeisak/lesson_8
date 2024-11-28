package kg.geeks.game.template;

public class Magic extends Hero{
    private int roundsBoosted = 0;
    private final int boostAmount = 5;

    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(roundsBoosted < 4){
            for(Hero hero : heroes){
                if(hero != this && hero.getHealth() > 0){
                    hero.setDamage(hero.getDamage() + boostAmount);
                }
            }
            roundsBoosted++;
            System.out.println(getName() + " increased the heroes' attack by " + boostAmount + " in round " + roundsBoosted);

        }
    }
}
