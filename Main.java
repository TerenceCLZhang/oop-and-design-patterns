import OOP_Principles.Abstraction.Abstraction;
import OOP_Principles.Composition.Composition;
import OOP_Principles.Coupling.Coupling;
import OOP_Principles.Encapsulation.Encapsulation;
import OOP_Principles.Inheritance.Inheritance;
import OOP_Principles.Polymorphism.Polymorphism;

public class Main {

  public static void main(String[] args) {
    Encapsulation encapsulation = new Encapsulation();
    Abstraction abstraction = new Abstraction();
    Polymorphism polymorphism = new Polymorphism();
    Inheritance inheritance = new Inheritance();
    Composition composition = new Composition();
    Coupling coupling = new Coupling();

    polymorphism.Example();
  }
}
