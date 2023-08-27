package designpatterns.gof.creational.factory;

public class Server extends Computer{

  private String CPU;
  private String RAM;
  private String HDD;

  public Server(String CPU, String RAM, String HDD) {
    this.CPU = CPU;
    this.RAM = RAM;
    this.HDD = HDD;
  }

  @Override
  public String getRam() {
    return RAM;
  }

  @Override
  public String getHdd() {
    return HDD;
  }

  @Override
  public String getCpu() {
    return CPU;
  }
}
