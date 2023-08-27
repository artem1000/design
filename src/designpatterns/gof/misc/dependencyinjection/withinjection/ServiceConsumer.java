package designpatterns.gof.misc.dependencyinjection.withinjection;

public interface ServiceConsumer {
    void processMessages(String message, String recipient);
}
