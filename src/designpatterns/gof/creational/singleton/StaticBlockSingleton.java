package designpatterns.gof.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {   // executed when the class is loaded into the memory; we have exception handling here;
        // but singleton may still be created too early
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred when creating a singleton");
        }
    }

    private StaticBlockSingleton() {}

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
