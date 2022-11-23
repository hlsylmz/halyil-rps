package Day44;

import java.sql.SQLOutput;

public class CallCenter {
    public static void main(String[] args) {
        WhatsAppC wa=new WhatsAppC();
        wa.launch();
        wa.allOSComptatible=true;
        wa.isFree=true;
        wa.name="Whats App";
        wa.call("Ozzy");
        wa.sendMessage("Thank you...");
        wa.videoCall();
        wa.accept();
        VoiceCallableI.decline();
        System.out.println(VoiceCallableI.CAN_CALL);
        wa.getCount();
        wa.setCount(4);


        System.out.println("--------------------");
        VoiceCallableI obj=new WhatsAppC();
        ((WhatsAppC) obj).launch();

        ((WhatsAppC) obj).allOSComptatible=false;
        obj.call("Mr Tom");
        ((WhatsAppC) obj).videoCall();
        ((VideoCallableI) obj).videoCall();
    }

}
