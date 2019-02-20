public class GameModeMenu {

    void selectionmMode() {

        System.out.println("Entrez le numéro correspondant au mode de jeu voulu.");
        System.out.println("1 - Mode +/-");
        System.out.println("2 - Mastermind");
        System.out.println("3 - Quitter");

    }

    boolean selectionMode(int gameModeNum) {

        if(gameModeNum==1){
            ModePlusMinus modePlusMinus=new ModePlusMinus();
            modePlusMinus.runGamePlusMinus();
            return true;
        } else if (gameModeNum==2){
return false;
        }else if (gameModeNum==3){
            return false;

        }else {
            return false;

        }


    }

}
