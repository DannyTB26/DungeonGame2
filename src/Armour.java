public class Armour {
    private static String name;
    private static int defence;

    public Armour(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    public static void setValues(String givenName, int givenDefence) {
        name = givenName;
        defence = givenDefence;
    }
}
