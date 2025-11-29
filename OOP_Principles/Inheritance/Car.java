package OOP_Principles.Inheritance;

public class Car extends Vehicle {

  private int numberOfDoors;

  public Car(String brand, String model, int year, int numberOfDoors) {
    super(brand, model, year);
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  public String toString() {
    return String.format(
      "%d %s %s with %d doors",
      super.year,
      super.brand,
      super.model,
      this.numberOfDoors
    );
  }
}
