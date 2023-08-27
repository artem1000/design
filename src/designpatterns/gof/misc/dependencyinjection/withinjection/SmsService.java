package designpatterns.gof.misc.dependencyinjection.withinjection;

public class SmsService implements MessageService{

    @Override
    public void sendMessage(String message, String recipient) {
        //some logic to send SMS
        System.out.printf("SMS %s has been send to recipient %s%n", message, recipient);
    }
}
