import java.util.Scanner;

public class ModePlusMinus {

    void runGamePlusMinus(){

        int codeReponse=3591;

        System.out.println("Code à trouver = "+codeReponse);

        int nbSolution1=(codeReponse%10000)/1000;
        int nbSolution2=(codeReponse%1000)/100;
        int nbSolution3=(codeReponse%100)/10;
        int nbSolution4=(codeReponse%10)/1;



        System.out.println(" ");
        System.out.println("Entrez un combinaisons.");

        Scanner sc=new Scanner(System.in);

        int code=sc.nextInt();

        int nb1=(code%10000)/1000;
        int nb2=(code%1000)/100;
        int nb3=(code%100)/10;
        int nb4=(code%10)/1;

        System.out.println(nb1+" | "+nb2+" | "+nb3+" | "+nb4);

        char reponseNumnb1;
        char reponseNumnb2;
        char reponseNumnb3;
        char reponseNumnb4;


        if (nbSolution1<nb1){
            reponseNumnb1='-';
        } else if (nbSolution1==nb1){
            reponseNumnb1='=';
        }else {
            reponseNumnb1='+';
        }

        if (nbSolution2<nb2){
            reponseNumnb2='-';
        } else if (nbSolution2==nb2){
            reponseNumnb2='=';
        }else {
            reponseNumnb2='+';
        }

        if (nbSolution3<nb3){
            reponseNumnb3='-';
        } else if (nbSolution3==nb3){
            reponseNumnb3='=';
        }else {
            reponseNumnb3='+';
        }

        if (nbSolution4<nb4){
            reponseNumnb4='-';
        } else if (nbSolution4==nb4){
            reponseNumnb4='=';
        }else {
            reponseNumnb4='+';
        }

        System.out.println(reponseNumnb1+" | "+reponseNumnb2+" | "+reponseNumnb3+" | "+reponseNumnb4);

        }


    }
