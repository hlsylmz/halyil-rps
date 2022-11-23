package Day44;

public abstract class MessagingAppAC {
    public String name;
    protected boolean isFree;
    boolean allOSComptatible;
    private static int count;
    public final static String App_TYPE="Messenger";

    public MessagingAppAC(){
        System.out.println("MessagingApp no-args contstructor...");

    }
    public MessagingAppAC(String name, int count){
        this.name=name;
        MessagingAppAC.count=count;
    }
    abstract void sendMessage(String msg);
    void launch(){
        System.out.println("MessagingaApp is launching...");
    }
    public static void close(){
        System.out.println("MessagingApp is closing ...");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MessagingAppAC.count = count;
    }
}
