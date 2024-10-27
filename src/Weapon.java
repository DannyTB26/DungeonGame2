public class Weapon {
    private static String name;
    private static int damage;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public static void setValues(String givenName, int givenDamage) {
        name = givenName;
        damage = givenDamage;
    }
}
