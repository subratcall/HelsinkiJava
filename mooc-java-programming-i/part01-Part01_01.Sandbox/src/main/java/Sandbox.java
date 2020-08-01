
import java.util.ArrayList;


public class Sandbox {

    public static void main(String[] args) {
        Message sms = new Message("SMS");
        Message mms = new Message("MMS");

        System.out.println(sms.equals(sms));
        System.out.println(sms.equals(mms));

        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

//        if (!viestit.contains(sms)) {
//            messages.add(sms);
//        }

        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }

        System.out.println(messages.size());
    }

}
