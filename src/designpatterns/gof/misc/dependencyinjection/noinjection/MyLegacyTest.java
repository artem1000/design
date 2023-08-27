package designpatterns.gof.misc.dependencyinjection.noinjection;

public class MyLegacyTest {
    /*
    * This works but there are issues with this design:
    *   1. MyApplication is responsible for initializing EmailService - so it is a hardcoded dependency
    *       if we want to enable other service like SMS service in future - lots of changes.
    *   2. Testing is difficult since our app creates and instance of EmailService, we cannot mock it easily
    * */

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.processMessages("Some test email", "test@test.com");
    }
}
