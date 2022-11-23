package Day47;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        //Stack<Integer> numsStack= new Stack<>();
        Vector <Integer> numsStack=new Stack<>();
        numsStack.add(50);
        numsStack.add(70);
        numsStack.add(500);
        numsStack.add(50);
        System.out.println(numsStack);
        System.out.println(((Stack<Integer>)numsStack).peek());
        ((Stack<Integer>)numsStack).pop();
       System.out.println(numsStack.toString());
        System.out.println(((Stack<Integer>)numsStack).peek());
        System.out.println(numsStack.get(0));
        System.out.println(numsStack);
    }
}
