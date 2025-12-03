package SOLID.Dependency_Inversion_Principle;

import SOLID.Dependency_Inversion_Principle.Bad_Example.BadCar;
import SOLID.Dependency_Inversion_Principle.Good_Example.ElectricEngine;
import SOLID.Dependency_Inversion_Principle.Good_Example.GoodCar;
import SOLID.Dependency_Inversion_Principle.Good_Example.GoodEngine;

public class DependencyInversionPrinciple {

  /*
        High level modules should not depend on low level modules. Both should depend on abstraction.
        Classes should depend either on abstract classes or interfaces, rather than concrete classes.
        Promotes de-copupling between components, improving flexibility, maintainability, and ease of testing.
    */

  public void badExample() {
    BadCar badCar = new BadCar(); // Engine is initialised inside the car class, but we can't change the engine type if we added one without modifying the car class
    badCar.start();
  }

  public void goodExample() {
    // Engine and Car are now loosly coupled as Car now depends on an interface of Engine, meaning we can pass any type of Engine into Car.

    GoodEngine goodEngine = new GoodEngine();
    GoodCar car1 = new GoodCar(goodEngine);
    car1.start();

    ElectricEngine electricEngine = new ElectricEngine();
    GoodCar car2 = new GoodCar(electricEngine);
    car2.start();
  }
}
