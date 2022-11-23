package Day44;

public interface VoiceCallableI {
    boolean CAN_CALL= true;//public static final boolean CAN_CALL=true;
    //abstract method
    abstract void call(String contact);//void call(String name);//public abstract void call (String name);
    //static method
    static void decline(){
        System.out.println("Mike declined voice call ...");
    }
    //default method
    default void accept(){//public default void accept (){}
        System.out.println("Mike finally accepted voice call...");
    }
}
