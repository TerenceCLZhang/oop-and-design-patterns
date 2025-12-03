package SOLID.Dependency_Inversion_Principle.Good_Example;

public class ElectricEngine implements Engine {

  @Override
  public void start() {
    System.out.println("Electric engine starting...");
  }
}
