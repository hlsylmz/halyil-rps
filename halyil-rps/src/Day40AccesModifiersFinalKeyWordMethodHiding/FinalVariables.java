package Day40AccesModifiersFinalKeyWordMethodHiding;

public class FinalVariables {
    public final int ROADSTER_MAX_RANGE=600;
    public final int MODEL_3_MAXSPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME;

    public FinalVariables(){
        MODEL_3_MAXSPEED=200;
    }
    {
        MODEL_X_PASSENGERS=7;
    }
    static{
        ADMIN_USERNAME="Ozzy";
    }
    public static void main(String [] args){
        final int MAX_PASSENGERS_COUNT=5;
        final int SSN;
        SSN=66;
        //SSN++;
        FinalVariables fv=new FinalVariables();
        System.out.println(fv.ROADSTER_MAX_RANGE);
        System.out.println(fv.MODEL_3_MAXSPEED);
        System.out.println(FinalVariables.ADMIN_USERNAME);
        System.out.println(ADMIN_USERNAME);
        System.out.println(fv.MODEL_X_PASSENGERS);
        System.out.println(SSN);
        System.out.println(MAX_PASSENGERS_COUNT);
/*
• When a variable is declared with final keyword, its value can not be
modified.
• When local variable is final, we can declare and assign value later in
code
• When instance variable is final, we need to initialize it in:
• same statement
• constructor
• init block

 */

    }









}





