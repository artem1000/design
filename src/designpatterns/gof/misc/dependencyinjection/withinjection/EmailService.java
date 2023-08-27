package designpatterns.gof.misc.dependencyinjection.withinjection;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message, String recipient) {
        //some logic to send email
        System.out.printf("Email %s has been send to recipient %s%n", message, recipient);
    }
}
