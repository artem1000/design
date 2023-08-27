package designpatterns.gof.misc.dependencyinjection.noinjection;

public class EmailService {
    public void sendEmail(String message, String recipient) {
        //some logic here to send an email
        System.out.printf("Email sent to %s with a message %s%n", recipient, message);
    }
}
