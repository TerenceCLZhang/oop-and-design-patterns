package SOLID.Open_Closed_Principle.Bad_Example;

import SOLID.Open_Closed_Principle.ShapeType;

public class BadShape {

  // Adding a new shape would require modifying the existing shape class which violates OCP.
  // Could add new bugs to code that we know already works.

  public ShapeType type;
  public double radius;
  public double length;
  public double width;

  public BadShape(ShapeType type, double radius, double length, double width) {
    this.type = type;
    this.radius = radius;
    this.length = length;
    this.width = width;
  }

  public double calculateArea() {
    switch (type) {
      case CIRCLE:
        return Math.PI * Math.pow(radius, 2);
      case RECTANGLE:
        return length * width;
      default:
        throw new IllegalArgumentException("Invalid shape type");
    }
  }
}
