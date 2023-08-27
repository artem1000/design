package designpatterns.gof.creational.abstractfactory;

public class Main {

  public static void main(String... args) {
    BaseFactory<Animal> animalFactory = FactorySupplier.ANIMAL.make();
    BaseFactory<Computer> compFactory = FactorySupplier.COMPUTER.make();
    Animal duck = animalFactory.create("DUCK");
    Animal rabit = animalFactory.create("RABIT");
    Animal dog = animalFactory.create("DOG");
    Computer server = compFactory.create("SERVER");
    Computer desktop = compFactory.create("DESKTOP");
    System.out.println();
  }
}
