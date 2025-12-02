package SOLID.Open_Closed_Principle;

public class OpenClosedPrinciple {

  /*
        Software entities (classes, modules, functions, etc.) should be open for extension with new functionality, but closed for modification of the source code.
        Leverages inheritance and polymorphism.
        Allows us to build loosly coupled, maintainable code.
    */

  public void badExample() {
    // BadShape would need to be modified to add new shapes.

    BadShape circle = new BadShape(ShapeType.CIRCLE, 5, 0, 0);
    System.out.println(circle.calculateArea());

    BadShape rectangle = new BadShape(ShapeType.RECTANGLE, 0, 10, 5);
    System.out.println(rectangle.calculateArea());
  }

  public void goodExample() {
    // Shape follows OCP, as we just need to create subclasses for new shapes that extends from the Shape superclass.
    // Also follows SRP as it know does not manage multiple shapes. Each class is responsible for their own shape.

    Shape[] shapes = { new Circle(5), new Rectangle(10, 5) };

    for (Shape shape : shapes) {
      System.out.println(shape.calculateArea());
    }
  }
}
