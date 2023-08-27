package designpatterns.gof.creational.abstractfactory;

public class Dog implements Animal{
// add new animal Dog as class
  @Override
  public String getName() {
    return "Dog";
  }

  @Override
  public String getSound() {
    return "Woof";
  }
}
