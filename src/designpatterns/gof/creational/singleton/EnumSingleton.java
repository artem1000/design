package designpatterns.gof.creational.singleton;

public enum EnumSingleton {
    INSTANCE;
    //you can hang a number of fields/methods of the enum, and access them via single value enum.
    //Java guarantees that enum value is instantiated only once
    //also protects against reflection attacks.
    public int someIntValue = 2;

    public static EnumSingleton getSingleton(){
        return INSTANCE;
    }
}
