package SOLID.Interface_Segregation_Principle.Bad_Example;

public class BadCircle implements Shape {

  private double radius;

  public BadCircle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  // We have an issue here, as 2d shapes don't have volume. We are forced to implment the volume method from Shape.
  @Override
  public double volume() {
    throw new UnsupportedOperationException(
      "Volume operation not applicable for 2d shapes."
    );
  }
}
