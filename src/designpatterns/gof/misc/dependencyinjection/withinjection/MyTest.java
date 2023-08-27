package designpatterns.gof.misc.dependencyinjection.withinjection;

public class MyTest {
    public static void main(String[] args) {
        String msg = "Hello User";
        String email = "test@test.com";
        String phone = "5554443232";
        MessageServiceInjector messageServiceInjector = null;
        ServiceConsumer consumer = null;

        //Send email
        messageServiceInjector = new EmailServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessages(msg, email);

        //Send SMS
        messageServiceInjector = new SmsServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessages(msg, phone);
    }

}
