public class DungeonRoom {
    private int numEnemies;
    private String[] enemyNames = {"Kenna Eaton",
            "Leighton Delacruz",
            "Celine Cortes",
            "Banks Cain",
            "Kendra Sims",
            "Brian Li",
            "Paige Burton",
            "Zander Yang",
            "Angelina Mata",
            "Ray Larson",
            "Alayna Acevedo",
            "Dakari Hayes",
            "Iris Buchanan",
            "Enrique Garner",
            "Jacqueline Ashley",
            "Kylen Spencer"};

    private int numGold;
    private Weapon weapon;
    private Armour armour;
    private String[] weaponNames = {"Sword", "Axe", "Bow", "Scythe", "Crossbow"};
    private String[] armourNames = {"Leather", "Wooden", "Iron", "Steel", "Diamond"};

    public void createRoom() {
        numEnemies = (int)(Math.random()*4);
        numGold = (int)(Math.random()*101);

        System.out.println("You enter the next room, there are " + numEnemies + " enemies!");

        Weapon.setValues(weaponNames[(int)(Math.random()*weaponNames.length)], (int)(Math.random()*101));
        Armour.setValues(armourNames[(int)(Math.random()*armourNames.length)], (int)(Math.random()*21));
    }

    public void fight(Player player) {

        for (int i = 0; i < numEnemies; i++) {
            Skeleton skelly = new Skeleton(enemyNames[(int)(Math.random()*enemyNames.length)]);

            while (skelly.getHealth() > 0 || player.getHealth() > 0) {
                int turn = 1;
                System.out.println("An enemy appears! \n\nFIGHT!");

                skelly.getStats();
                if (turn % 2 != 0) {
                    player.playerTurn(player, skelly);
                } else {
                    skelly.enemyTurn(player, skelly);
                }

            }


        }
    }

    public void takeTreasure(Player player) {
        System.out.println("In the room you found " + numGold + " gold!");
        player.addGold(numGold);

    }
}
