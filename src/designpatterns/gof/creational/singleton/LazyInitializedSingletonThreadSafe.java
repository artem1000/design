package designpatterns.gof.creational.singleton;

public class LazyInitializedSingletonThreadSafe {
    private static volatile LazyInitializedSingletonThreadSafe instance;

    private LazyInitializedSingletonThreadSafe() {}

    public static LazyInitializedSingletonThreadSafe getInstanceThreadSafeBetter() {
        if (instance == null) { // double checked-locking - we check for null 2 times to avoid usage of partially created instances
            // but since Java allows publishing of partially constructed objects, we need to create a memory barrier by making
            //LazyInitializedSingletonThreadSafe instance VOLATILE (see above). This would prevent Java from publishing when it is
            //partially constructed by ThreadA so that ThreadB does not use partially constructed instance.
            synchronized (LazyInitializedSingletonThreadSafe.class){
                if (instance == null) {
                    instance = new LazyInitializedSingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}
