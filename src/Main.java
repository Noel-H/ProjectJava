import java.util.Scanner;

public class Main {

    static public void main(String... args) {

        boolean correctMenu=false;

        while (!correctMenu) {
            GameModeMenu gameModeMenu = new GameModeMenu();
            gameModeMenu.selectionmMode();
            Scanner sc = new Scanner(System.in);
            int gameModeNumChoose = sc.nextInt();
            correctMenu=gameModeMenu.selectionMode(gameModeNumChoose);
        }
    }

}
