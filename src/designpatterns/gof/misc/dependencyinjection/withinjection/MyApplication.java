package designpatterns.gof.misc.dependencyinjection.withinjection;

public class MyApplication implements ServiceConsumer{
    private final MessageService messageService;  // no hard coded initialization here

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;      // we are just using supplied service interface, that can be
        // used to mock a test case without need to send actual email. as we can bind to a service at runtime rather
        // than compile time
    }

    @Override
    public void processMessages(String message, String recipient) {
        messageService.sendMessage(message,recipient);
    }
}
