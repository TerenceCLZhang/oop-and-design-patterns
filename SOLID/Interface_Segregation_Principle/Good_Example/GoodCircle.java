package SOLID.Interface_Segregation_Principle.Good_Example;

public class GoodCircle implements Shape2D {

  private double radius;

  public GoodCircle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
