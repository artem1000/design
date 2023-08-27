package designpatterns.gof.creational.abstractfactory;

public class Desktop implements Computer{

  @Override
  public String getRam() {
    return "ram";
  }

  @Override
  public String getHdd() {
    return "hdd";
  }

  @Override
  public String getCpu() {
    return "cpu";
  }
}
