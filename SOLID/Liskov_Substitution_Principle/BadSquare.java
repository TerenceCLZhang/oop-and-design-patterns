package SOLID.Liskov_Substitution_Principle;

public class BadSquare extends Rectangle {

  public BadSquare(double height, double width) {
    super(height, width);
  }

  public void setHeight(double height) {
    super.height = height;
    super.width = height;
  }

  public void setWidth(double width) {
    super.height = width;
    super.width = width;
  }
}
