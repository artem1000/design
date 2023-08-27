package designpatterns.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*This is a flyweight factory class that will be used by clients to instantiate objects.
* It keeps a cache of object already instantiated reusing them*/
public class ShapeFactory {

    public enum ShapeType{OVAL_FILL, OVAL_NOFIILL, Line};  // using enum for type safety
    private static final Map<ShapeType, Shape> shapes = new HashMap<>();  // this is our cache for objects reuse <Composition>;

    public static Shape getShape(ShapeType type) {         //<Factory Pattern>  - getShape()
        Shape shape = shapes.get(type);   // first we go to our cache to see if we already have an object of that type created;
        // if so we reuse it, else we create it adding it to the cache
        if (shape == null) {
            shape = switch (type) {
                case OVAL_FILL -> new Oval(true);
                case OVAL_NOFIILL -> new Oval(false);
                default -> new Line();
            };
            shapes.put(type, shape);  // saving it for future reuse
        }
        return shape;
    }
}
