package designpatterns.gof.creational.abstractfactory;

public class Rabit implements Animal{

  @Override
  public String getName() {
    return "Rabit";
  }

  @Override
  public String getSound() {
    return "Rabits are muted";
  }
}
