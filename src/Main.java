import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Player player = new Player("", "");
    private static DungeonRoom room = new DungeonRoom();
    private static String userInput;

    public static void main(String[] args) {

        System.out.println("Welcome traveller! \nBefore you begin your adventure, please tell me your name: ");
        player.setName(input.nextLine());
        System.out.println("Now tell me your title (e.g. " + player.getName() + " of the Aseir");
        player.setTitle(input.nextLine());

        System.out.println("Hello " + player.getName() + " of the " + player.getTitle() + "! It is time to enter the dungeon");
        player.playerCheck();

        introduction();

    }

    public static void introduction() {
        System.out.println("Before you lies the entrance to a great dungeon. Do you dare enter (y/n)?");
        if (input.nextLine().toUpperCase().equals("Y")) {
            dungeon();
        }
    }

    public static void dungeon() {
        boolean leave = false;

        while (!leave) {
            room.createRoom();
            room.fight(player);

            if (player.getHealth() <= 0) {
                player.death();
                break;
            } else {
                room.takeTreasure(player);
            }

            System.out.println("Do you dare to continue (y/n)?");

            if (input.nextLine().toUpperCase().equals("Y")) {
                leave = false;
            } else {
                leave = true;
                System.out.println("You left the dungeon");
            }
        }


    }




}
