package Day40AccesModifiersFinalKeyWordMethodHiding;

public class FinalArray {
    public static void main(String[] args) {
        final int [] TEAMS={11,10};
        System.out.println(TEAMS[0]);
        TEAMS[0]=15;
        System.out.println(TEAMS[0]);
        int [] nums=new int[]{20,20,40};
        nums=new int [] {30,30,50};

        final int [] finalNums={23,66,67};
        finalNums[0]=120;
        //finalNums=new int {1,2,3};
/*
If array is declared as final, elements of array can be changed without
any problem
• Arrays are objects and object variables are always references in Java.
When we declare an object variable as final, it means that the variable
can not be changed to refer to anything else.

 */

    }
}
