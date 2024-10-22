import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("", "");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome traveller! \nBefore you begin your adventure, please tell me your name: ");
        player.setName(input.nextLine());
        System.out.println("Now tell me your title (e.g. " + player.getName() + " of the Aseir");
        player.setTitle(input.nextLine());

        System.out.println("Hello " + player.getName() + " of the " + player.getTitle() + "! It is time to enter the dungeon");
        player.playerCheck();

    }




}
