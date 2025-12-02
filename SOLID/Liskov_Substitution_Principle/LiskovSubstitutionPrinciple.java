package SOLID.Liskov_Substitution_Principle;

public class LiskovSubstitutionPrinciple {

  /*
        Objects of a superclass should be replaceable with objects of its subclass without affecting the correctness of the program.
        It ensures inheritance hierarchies are behaviourally consistent and that subclasses honour the contracts defined by their parent classes.
        Violations of this principle can lead to unexpected errors or broken polymorphism, where substituting a subclass causes failures or changes in behaviour.
    */

  public void BadExample() {
    Rectangle rectangle = new Rectangle(10, 5);
    rectangle.setHeight(11);
    System.out.println("Expected area = 11 * 5 = 55");
    System.out.println("Calculate Area: " + rectangle.calculateArea());

    // Change Rectangle with it's subclass Square
    BadSquare square = new BadSquare(5, 5);
    square.setHeight(6);
    System.out.println("Expected area = 6 * 5 = 30");
    System.out.println("Calculate Area: " + square.calculateArea()); // Gives 36 instead of 30, because setting width to 5, also sets height to 5. This violates LSP.
  }

  public void GoodExample() {
    Shape rectangle = new Rectangle(10, 5);
    System.out.println("Expected area = 10 * 5 = 50");
    System.out.println("Calculate Area: " + rectangle.calculateArea());

    Shape square = new Square(5);
    System.out.println("Expected area = 5 * 5 = 25");
    System.out.println("Calculate Area: " + square.calculateArea());
  }
}
