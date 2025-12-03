package SOLID.Dependency_Inversion_Principle.Good_Example;

public class GoodCar {

  private Engine engine; // car now depends on an interface

  public GoodCar(Engine engine) {
    this.engine = engine; // Car and Engine is no longer tightly coupled
  }

  public void start() {
    engine.start();
    System.out.println("Car has started...");
  }
}
