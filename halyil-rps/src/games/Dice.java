package games;

import java.util.Random;

public class Dice {

    public int n
        umOfSides;
    //constructor, anrops med keyword new
    public Dice(int numOfSides){
        this.numOfSides=numOfSides;
    }
    public int roll(){
        //I want to an integer between 1 and 6
        Random diceRandom=new Random();
        int result=diceRandom.nextInt(6)+1;
        return result;
    }

}
