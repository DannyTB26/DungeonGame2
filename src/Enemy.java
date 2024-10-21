public class Enemy {
    private String name;
    private double damage;
    private double health;
    private int defence;

    public Enemy(String name, double damage, double health, int defence) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public int getDefence() {
        return defence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void attack() {
        System.out.println(getName() + " attacks! \n\n" + getName() + " dealt " + getDamage() + "!");
    }

    public void defend() {
        System.out.println(getName() + " defends!");
    }

    public void checkHealth() {
        if (getHealth() <= 0) {
            death();
        }
    }

    public void death() {
        System.out.println(getName() + " perished!");
    }
}
