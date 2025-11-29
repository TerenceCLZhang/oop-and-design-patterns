package OOP_Principles.Inheritance;

public class Inheritance {

  /*
   * Inheritance involves creating new classes (subclass or derived class) based on existing classes
   * (superclass or base class). Subclasses inherit properties and behaviours from their suplerclasses
   * and can also add new features or override existing ones. Inheritance is often described in terms
   * as an "is-a" relationship.
   */

  public void Example() {
    Car car = new Car("Ford", "Mustang", 2025, 4);
    MotorBike motorBike = new MotorBike(
      "Harley Davidson",
      "Touring",
      2021,
      200
    );

    car.Start();
    System.err.println(car);
    car.Stop();

    motorBike.Start();
    System.out.println(motorBike);
    motorBike.Stop();
  }
}
