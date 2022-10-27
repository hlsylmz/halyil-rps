package Day40AccesModifiersFinalKeyWordMethodHiding;

public class Kangaroo extends Marsupial {
    /*public boolean isBiped(){
        return true;
    }*/
    public static boolean isBiped(){
        return true;
    }
    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
}
