import java.util.Scanner;

public class Player {
    private String name;
    private String title;
    private Inventory inventory;
    private double health = 100;
    private int gold;
    private Scanner input = new Scanner(System.in);

    public Player(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() { return title; }

    public Inventory getInventory() {
        return inventory;
    }

    public double getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) { this.title = title; }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void addGold(int gold) { this.gold += gold; }

    public void useItem(String item) {
        System.out.println("You used " + item);
    }

    public void playerCheck() {
        System.out.println("Would you like to check your stats (Y/N)?");
        String response = input.nextLine();
        if (response.toUpperCase().equals("Y")) {
            getStats();
        } else if (response.toUpperCase().equals("N")) {
            System.out.println("Very well\n");
        } else {
            System.out.println("Sorry, I didn't understand that\n");
            playerCheck();
        }
    }

    public void getStats() {
        System.out.println(name + " of the " + title);
        System.out.println("Health: " + health);
        inventory.printInventory();
        System.out.println("Gold: " + gold);
        System.out.println();
    }

    public void playerTurn(Player player, Enemy enemy) {
        System.out.println("WIP");
    }

    public void death() {
        System.out.println("You died! \nYour Stats: ");
        getStats();
    }


}
