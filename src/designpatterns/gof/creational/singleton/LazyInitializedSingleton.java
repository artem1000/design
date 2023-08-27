package designpatterns.gof.creational.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {   // instance created only when needed, not sooner
        //works ok for single-threaded apps, but for multi-threaded apps if 2 threads get into if statement, then
        // 2 instances will be created instead of one. To fix this issue we can use Synchronized on the getInstance()
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public static synchronized LazyInitializedSingleton getInstanceThreadSafe() {
        //because we sync on entire method performance may be compromised. It may be better to sync just on the if
        // block where instance is created, and nowhere else; see below
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public static LazyInitializedSingleton getInstanceThreadSafeBetter() {
        if (instance == null) { // double checked-locking - we check for null 2 times to avoid usage of partially created instances
            //NOTE - we need to make  LazyInitializedSingleton instance VOLATILE in this case. See - LazyInitializedSingletonThreadSafe
            synchronized (LazyInitializedSingleton.class){
                if (instance == null) {
                    instance = new LazyInitializedSingleton();
                }
            }
        }
        return instance;
    }

}
