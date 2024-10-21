public class Skeleton extends Enemy {

    public Skeleton(String name) {
        super(name, 5.0, 10.0, 5);
    }

    public double specialAttack() {
        System.out.println(this.getName() + " used their special attack!");
        System.out.println("It dealt " + getDamage()*getDefence()/2 + "!");

        return getDamage()*getDefence()/2;
    }
}
