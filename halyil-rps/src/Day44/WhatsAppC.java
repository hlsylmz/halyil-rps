package Day44;

public class  WhatsAppC extends MessagingAppAC implements VideoCallableI,VoiceCallableI {

    @Override
    void sendMessage(String msg) {
        System.out.println("WhatsApp - sending a message - " + msg+ "...");

    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp- doing a video call Mr mike...");

    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp - calling " +contact+ "...");
    }

    @Override
    public void accept() {
        VoiceCallableI.super.accept();
    }

    WhatsAppC() {
        super();
    }

    @Override
    void launch() {
        super.launch();
    }

}
