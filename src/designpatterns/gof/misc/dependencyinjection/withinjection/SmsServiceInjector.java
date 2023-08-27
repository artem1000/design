package designpatterns.gof.misc.dependencyinjection.withinjection;

public class SmsServiceInjector implements MessageServiceInjector{

    @Override
    public ServiceConsumer getConsumer() {
        return new MyApplication(new SmsService());
    }
}
