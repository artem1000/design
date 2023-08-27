package designpatterns.gof.creational.abstractfactory;

public enum FactorySupplier {
  ANIMAL {
    @Override
    @SuppressWarnings("unchecked")  // the warning is suppressed because we are using ENUM Value = ANIMAL
    public BaseFactory<Animal> make() {   // why do we have this warning?
      return new AnimalFactory();
    }
  },
   COMPUTER{
    @Override
    @SuppressWarnings("unchecked")  // the warning is suppressed because we are using ENUM Value = COMPUTER
    public BaseFactory<Computer> make() {
      return new ComputerFactory();
    }
  };

  public abstract <T> BaseFactory<T> make();
}