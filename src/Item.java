public class Item {
    private String itemName;
    private int healthHealed;
    private int defenceIncreased;

    public Item(String itemName, int healthHealed, int defenceIncreased) {
        this.itemName = itemName;
        this.healthHealed = healthHealed;
        this.defenceIncreased = defenceIncreased;
    }

    public String getItemName() {
        return itemName;
    }

    public int getHealthHealed() {
        return healthHealed;
    }

    public int getDefenceIncreased() {
        return defenceIncreased;
    }

    public int useItem(Item item) {
        player.setHealth(player.getHealth() + item.getHealthHealed());
        player.setDefence(player.getDefence() + item.getDefenceIncreased());
    }
}
