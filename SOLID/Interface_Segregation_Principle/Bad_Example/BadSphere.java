package SOLID.Interface_Segregation_Principle.Bad_Example;

public class BadSphere implements Shape {

  private double radius;

  public BadSphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return 4 * Math.PI * radius * radius;
  }

  @Override
  public double volume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}
