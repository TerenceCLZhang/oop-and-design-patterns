package SOLID.Open_Closed_Principle.Good_Example;

public class Rectangle extends Shape {

  public double height;
  public double width;

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return height * width;
  }
}
