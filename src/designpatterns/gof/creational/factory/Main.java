package designpatterns.gof.creational.factory;

public class Main {

  public static void main(String... args) {
    Computer server = ComputerFactory.getComputer("SERVER", "150GB", "Pentium", "1Gb");  // code for interface Computer
    Computer pc = ComputerFactory.getComputer("PC", "150GB", "Pentium", "1Gb");           // code for interface Computer
    System.out.println();
  }

}
