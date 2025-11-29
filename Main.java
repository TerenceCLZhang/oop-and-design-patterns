import OOP_Principles.Abstraction.Abstraction;
import OOP_Principles.Composition.Composition;
import OOP_Principles.Coupling.Coupling;
import OOP_Principles.Encapsulation.Encapsulation;
import OOP_Principles.Inheritance.Inheritance;

public class Main {

  public static void main(String[] args) {
    Encapsulation encapsulation = new Encapsulation();
    Abstraction abstraction = new Abstraction();
    Composition composition = new Composition();
    Inheritance inheritance = new Inheritance();
    Coupling coupling = new Coupling();

    coupling.LooseCouplingExample();
  }
}
