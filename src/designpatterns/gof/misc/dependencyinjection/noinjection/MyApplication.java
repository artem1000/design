package designpatterns.gof.misc.dependencyinjection.noinjection;

public class MyApplication {
    private EmailService emailService = new EmailService();
    // putting email service initialization into a constructor shifts the problem to the testing app that will
    //need to initialize EmailService -- not a good design either.

    public void processMessages(String msg, String recipient) {
        emailService.sendEmail(msg, recipient);
    }
}
