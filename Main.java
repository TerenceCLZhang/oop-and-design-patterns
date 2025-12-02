import OOP_Principles.Abstraction.Abstraction;
import OOP_Principles.Composition.Composition;
import OOP_Principles.Coupling.Coupling;
import OOP_Principles.Encapsulation.Encapsulation;
import OOP_Principles.Inheritance.Inheritance;
import OOP_Principles.Polymorphism.Polymorphism;
import SOLID.Liskov_Substitution_Principle.LiskovSubstitutionPrinciple;
import SOLID.Open_Closed_Principle.OpenClosedPrinciple;
import SOLID.Single_Responsibility_Principle.SingleResponsibilityPrinciple;

public class Main {

  public static void main(String[] args) {
    // OOP Principles
    Encapsulation encapsulation = new Encapsulation();
    Abstraction abstraction = new Abstraction();
    Polymorphism polymorphism = new Polymorphism();
    Inheritance inheritance = new Inheritance();
    Composition composition = new Composition();
    Coupling coupling = new Coupling();

    // SOLID Principles
    SingleResponsibilityPrinciple singleResponsibilityPrinciple =
      new SingleResponsibilityPrinciple();
    OpenClosedPrinciple openClosedPrinciple = new OpenClosedPrinciple();
    LiskovSubstitutionPrinciple liskovSubstitutionPrinciple =
      new LiskovSubstitutionPrinciple();

    // Testing
    liskovSubstitutionPrinciple.goodExample();
  }
}
