package designpatterns.gof.creational.singleton;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton(); // instance is created even though no one is using it.
    // too early... bad for memory
    // no exception handling here

    //private constructor to disallow creation of multiple instances
    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
}
