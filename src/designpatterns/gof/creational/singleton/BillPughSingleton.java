package designpatterns.gof.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {}

    //private inner static class creates instance. This inner class is loaded into the memory
    //only when getInstance() is called. It is also thread-safe without synchronization
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
