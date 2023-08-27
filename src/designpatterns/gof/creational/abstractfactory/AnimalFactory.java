package designpatterns.gof.creational.abstractfactory;

public class AnimalFactory implements BaseFactory<Animal>{

  @Override
  public Animal create(String type) {
    switch (type) {
      case "DUCK":
        return new Duck();
      case "RABIT":
        return new Rabit();
      case "DOG":                         //register new animal dog to the factory
        return new Dog();
      default:
        return null;
    }
  }
}
