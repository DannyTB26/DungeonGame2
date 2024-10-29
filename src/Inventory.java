import java.util.Scanner;

public class Inventory {
    String[] keys;
    Item[] items;
    Weapon[] weapons;
    Scanner input = new Scanner(System.in);
    String usedItem = "";


    public Inventory() {
        keys = new String[5];
        items = new Item[5];
        weapons = new Weapon[3];
    }

    public int getItems() {
        int count = 0;

        for (Item item : items) {
            if (item != null) {
                count++;
            }
        }

        return count;
    }

    public void printInventory() {
        System.out.println("WIP");
    }

    public void useItem(Player player) {
        for (Item item : items) {
            System.out.println(item + "\n");
        }
        System.out.println("\nPlease enter what item you would like to use: ");
        usedItem = input.nextLine();

        for (Item item : items) {
            if (item.getName().equals(usedItem)) {
                item.use();
            } else {
                System.out.println("I didn't understand that\n");
                item.useItem(player);
            }
        }
    }
}
