import java.util.Scanner;

public class Main {

    static public void main(String... args) {

        GameModeMenu gameModeMenu = new GameModeMenu();
        gameModeMenu.selectionmMode();
        Scanner sc=new Scanner(System.in);
        int gameModeNumChoose=sc.nextInt();
        gameModeMenu.selectionMode(gameModeNumChoose);

    }

}
