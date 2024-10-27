public class Skeleton extends Enemy {

    public Skeleton(String name) {
        super(name, 80.0, 300.0, 5);
    }

    public void getStats() {
        System.out.println(super.getName() + " the Skeleton");
        System.out.println("Health: " + super.getHealth());
        System.out.println("Damage: " + super.getDamage());
        System.out.println("Defence: " + super.getDefence());
    }

    public double specialAttack() {
        System.out.println(this.getName() + " used their special attack!");
        System.out.println("It dealt " + getDamage()*getDefence()/2 + "!");

        return getDamage()*getDefence()/2;
    }
}
