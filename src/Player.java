public class Player {
    private String name;
    private Inventory inventory;
    private double health;

    public Player(String name, Inventory inventory, double health) {
        this.name = name;
        this.inventory = inventory;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public double getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void useItem(String item) {
        System.out.println("You used " + item);
    }
}
