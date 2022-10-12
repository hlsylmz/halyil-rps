package RockPaperScissors3;

import java.util.Random;

public class Fist {

     public static final int ROCK=0;
     public static final int PAPER=1;
     public static final int SCISSORS=2;
      Random random;

    Fist(){random=new Random();}


    // en metod för att ta random siffror som är 0, 1 och 2.
    public int play(){
        Random random=new Random();
        int result=random.nextInt(3);
        return result;
    }

}

