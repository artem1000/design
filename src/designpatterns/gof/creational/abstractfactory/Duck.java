package designpatterns.gof.creational.abstractfactory;

public class Duck implements Animal{

  @Override
  public String getName() {
    return "Duck";
  }

  @Override
  public String getSound() {
    return "Quak";
  }
}
