package designpatterns.gof.creational.factory;

public class ComputerFactory {

  public static Computer getComputer(String type, String hdd, String cpu, String ram) {
    if ("PC".equals(type)) {
      return new Desktop(cpu, ram, hdd);
    }
    if ("SERVER".equals(type)) {
      return new Server(cpu, ram, hdd);
    }
    return null;
  }
}
