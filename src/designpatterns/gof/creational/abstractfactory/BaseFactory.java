package designpatterns.gof.creational.abstractfactory;

public interface BaseFactory<T> {
      T create(String type);
}
