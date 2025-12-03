package SOLID.Dependency_Inversion_Principle.Bad_Example;

public class BadCar {

  private BadEngine engine;

  public BadCar() {
    // tight coupling between car and engine, meaning if engine changes, it might affect the car class, violating DIP
    // we also cannot change the type of engine a car can have, if we decide to add more engine types
    this.engine = new BadEngine();
  }

  public void start() {
    engine.start();
    System.out.println("Car has started...");
  }
}
