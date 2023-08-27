package designpatterns.gof.misc.dependencyinjection.withinjection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyApplicationTest {

    private MessageServiceInjector messageServiceInjector;
    @Before
    public void setUp() {
        //mock injector with unanimous class
        messageServiceInjector = new MessageServiceInjector() {
            @Override
            public ServiceConsumer getConsumer() {
                return new ServiceConsumer() {  //another unanimous class
                    @Override
                    public void processMessages(String message, String recipient) {
                        System.out.printf("Printing message %s for recipient %s%n", message, recipient); // ad-hoc implementation
                    }
                };
            }
        };
    }

    @Test
    public void Test(){
        ServiceConsumer consumer = messageServiceInjector.getConsumer();
        consumer.processMessages("Test", "test@test.com");
    }

    @After
    public void tearDown() {
        messageServiceInjector = null;
    }
}