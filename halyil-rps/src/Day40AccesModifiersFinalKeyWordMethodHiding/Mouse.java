package Day40AccesModifiersFinalKeyWordMethodHiding;

public class Mouse extends Rodent {
    protected int taillength=8;
    public void getMouseDetails(){
        System.out.println("tail: "+taillength+ " ,parentTail: " +super.taillength);
    }

}
