package designpatterns.gof.creational.singleton;

import java.io.*;

public class LazyInitializedSingletonSerializable  implements Serializable {
    private static final long serialVersion = 3434323434234234L;
    private static LazyInitializedSingletonSerializable instance;

    private LazyInitializedSingletonSerializable() {}

    public static LazyInitializedSingletonSerializable getInstance() {   // instance created only when needed, not sooner
        //works ok for single-threaded apps, but for multi-threaded apps if 2 threads get into if statement, then
        // 2 instances will be created instead of one. To fix this issue we can use Synchronized on the getInstance()
        if (instance == null) {
            instance = new LazyInitializedSingletonSerializable();
        }
        return instance;
    }

    // need to add this method to insure deserialized instance is truly the same - having the same hash value as
    // the one we were serializing;
    protected Object readResolve(){
        return getInstance();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazyInitializedSingletonSerializable instanceOne = LazyInitializedSingletonSerializable.getInstance();
        //serialize object
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserialize object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        LazyInitializedSingletonSerializable instanceTwo = (LazyInitializedSingletonSerializable) in.readObject();
        in.close();
        System.out.printf("Hash code of instance one: %s%n", instanceOne.hashCode());
        System.out.printf("Hash code of instance two: %s%n", instanceTwo.hashCode());
    }

}
