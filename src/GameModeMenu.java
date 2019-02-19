public class GameModeMenu {

    void selectionmMode() {

        System.out.println("Entrez le numéro correspondant au mode de jeu voulu.");
        System.out.println("1 - Mode +/-");
        System.out.println("2 - Mastermind");
        System.out.println("3 - Quitter");

    }

    void selectionMode(int gameModeNum) {

        if(gameModeNum==1){
            ModePlusMinus modePlusMinus=new ModePlusMinus();
            modePlusMinus.runGamePlusMinus();
        } else if (gameModeNum==2){

        }else if (gameModeNum==3){

        }else {

        }


    }

}
