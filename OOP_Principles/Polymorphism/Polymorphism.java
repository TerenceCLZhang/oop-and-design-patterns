package OOP_Principles.Polymorphism;

public class Polymorphism {

  /*
   * Polymorphism is the ability of an object to take many forms.
   */

  public void example() {
    Vehicle[] vehicles = { new Car(), new Bike(), new Boat() };

    for (Vehicle vehicle : vehicles) {
      vehicle.Honk();
    }
  }
}
