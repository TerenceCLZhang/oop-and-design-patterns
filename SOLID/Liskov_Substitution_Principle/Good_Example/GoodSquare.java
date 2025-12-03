package SOLID.Liskov_Substitution_Principle.Good_Example;

import SOLID.Liskov_Substitution_Principle.Shape;

public class GoodSquare extends Shape {

  private double side;

  public GoodSquare(double side) {
    this.side = side;
  }

  @Override
  public double calculateArea() {
    return side * side;
  }
}
