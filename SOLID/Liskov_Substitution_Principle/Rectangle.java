package SOLID.Liskov_Substitution_Principle;

public class Rectangle extends Shape {

  protected double height;
  protected double width;

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}
