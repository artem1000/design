package designpatterns.gof.misc.dependencyinjection.withinjection;

public class EmailServiceInjector implements MessageServiceInjector{

    @Override
    public ServiceConsumer getConsumer() {
        return new MyApplication(new EmailService());
    }
}
