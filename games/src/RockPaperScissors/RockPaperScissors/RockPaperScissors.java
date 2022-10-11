package RockPaperScissors.RockPaperScissors;

import java.util.Scanner;
public class RockPaperScissors {

    RockPaperScissors.RockPaperScissors.Player player ;
    RockPaperScissors.RockPaperScissors.Fist aIFist;

//construktor: anropas med new
    RockPaperScissors(String playerName, int playerScore) {
         player = new Player("lucas", 0);
         aIFist = new RockPaperScissors.RockPaperScissors.Fist();
     }
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors("lucas", 0);
        game.playGame();
    }
    void playGame() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Rock, paper, scissors");
        String choice=scanner.nextLine();
        String stringresult="";
        int intresult=aIFist.play();

        if(intresult== RockPaperScissors.RockPaperScissors.Fist.ROCK){
            stringresult="ROCK";
        }
        if(intresult== RockPaperScissors.RockPaperScissors.Fist.PAPER){
            stringresult="PAPER";
        }
        if(intresult== Fist.SCISSORS){
            stringresult="SCISSORS";
        }
        if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("ROCK")){
            System.out.println("Oavgjort");
        }if(choice.equalsIgnoreCase("Rcok")&&stringresult.equalsIgnoreCase("PAPER")){
            System.out.println("Datorn vann");
        }if(choice.equalsIgnoreCase("Rock")&&stringresult.equalsIgnoreCase("SCISSORS")){
            System.out.println("Du vann");
        }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("PAPER")){
            System.out.println("Oavgjort");
        }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("ROCK")){
            System.out.println("Du vann");
        }if(choice.equalsIgnoreCase("Paper")&&stringresult.equalsIgnoreCase("SCISSORS")){
            System.out.println("Datorn vann");
        }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("SCISSORS")){
            System.out.println("Oavgjort");
        }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("ROCK")){
            System.out.println("Datorn vann");
        }if(choice.equalsIgnoreCase("Scissors")&&stringresult.equalsIgnoreCase("PAPER")){
            System.out.println("Du Vann");
        }
    }
}
