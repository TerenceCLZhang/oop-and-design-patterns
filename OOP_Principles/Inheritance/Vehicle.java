package OOP_Principles.Inheritance;

public class Vehicle {

  protected String brand;
  protected String model;
  protected int year;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  @Override
  public String toString() {
    return String.format("%d %s %s", this.year, this.brand, this.model);
  }

  public void Start() {
    System.out.println("Vehicle is start...");
  }

  public void Stop() {
    System.out.println("Vehicle is stop...");
  }
}
