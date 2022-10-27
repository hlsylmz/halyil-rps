package Day40AccesModifiersFinalKeyWordMethodHiding;

import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {
        final ArrayList<String> COLORS=new ArrayList<>();
        COLORS.add("Orange");
        COLORS.add("Res");
        COLORS.remove(0);
        //COLORS=new ArrayList<String>();//Cannot assign a value to final variable 'COLORS'
  /*
  • Follows same rules of arrays
• We can remove or update any values
• We can not re-assign it to another object using new keyword
   */


    }
}
