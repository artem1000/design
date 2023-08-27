package designpatterns.gof.creational.abstractfactory;

public class ComputerFactory implements BaseFactory<Computer>{

  @Override
  public Computer create(String type) {
    switch (type) {
      case "DESKTOP":
        return new Desktop();
      case "SERVER":
        return new Server();
      default:
        return null;
    }
  }
}
