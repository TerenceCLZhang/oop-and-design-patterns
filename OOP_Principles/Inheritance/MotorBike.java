package OOP_Principles.Inheritance;

public class MotorBike extends Vehicle {

  private int topSpeed;

  public MotorBike(String brand, String model, int year, int topSpeed) {
    super(brand, model, year);
    this.topSpeed = topSpeed;
  }

  @Override
  public String toString() {
    return String.format(
      "%d %s %s with a top speed of %d km/h",
      super.year,
      super.brand,
      super.model,
      this.topSpeed
    );
  }
}
