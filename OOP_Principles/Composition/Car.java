package OOP_Principles.Composition;

public class Car {

  private Chassis chassis = new Chassis();
  private Engine engine = new Engine();
  private Seats seats = new Seats();
  private Wheels wheels = new Wheels();

  public void StartCar() {
    chassis.Support();
    seats.Sit();
    engine.Start();
    wheels.Rotate();
    System.out.println("Car has started.");
  }
}
