package designpatterns.gof.creational.abstractfactory;

public class Server implements Computer{
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
