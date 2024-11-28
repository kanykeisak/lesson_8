package kg.geeks.game.template;

public class Reaper extends Hero {

    public Reaper(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SPECIAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // Вычисляем процент здоровья
        double healthPercentage = (double) this.getHealth() / this.getMaxHealth(); // Процент здоровья

        // Если здоровье меньше 30%, увеличиваем урон в два раза
        if (healthPercentage < 0.30 && healthPercentage >= 0.15) {
            this.setDamage(this.getDamage() * 2);
            System.out.println(getName() + " в ярости! Урон увеличен в 2 раза!");
        }

        // Если здоровье меньше 15%, увеличиваем урон втрое
        if (healthPercentage < 0.15) {
            this.setDamage(this.getDamage() * 3);
            System.out.println(getName() + " в ярости! Урон увеличен в 3 раза!");
        }
    }
}
