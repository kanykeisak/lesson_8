package kg.geeks.game.template;

import java.util.Random;

public class Avenger extends Hero{
    private boolean isTeamProtected = false;
    private static Random random = new Random();

    public Avenger(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.TEAM_PROTECTION);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(random.nextInt(100) < 20){
            isTeamProtected = true;
            System.out.println(getName() + " активировал защиту команды на это раунд");
        } else {
            isTeamProtected = false;
        }
    }

    public boolean isTeamProtected(){
        return isTeamProtected;
    }
}
