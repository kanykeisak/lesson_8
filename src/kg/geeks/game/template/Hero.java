package kg.geeks.game.template;

public abstract class Hero extends GameEntity{

    private final SuperAbility ability;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }


    public void attack(Boss boss){
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);

    public int getMaxHealth() {
        return super.getHealth();  // Предполагаем, что максимальное здоровье равно текущему
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + super.toString();
    }
}
