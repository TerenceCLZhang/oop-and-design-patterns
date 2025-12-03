package SOLID.Interface_Segregation_Principle;

import SOLID.Interface_Segregation_Principle.Bad_Example.BadCircle;
import SOLID.Interface_Segregation_Principle.Bad_Example.BadSphere;
import SOLID.Interface_Segregation_Principle.Good_Example.GoodCircle;
import SOLID.Interface_Segregation_Principle.Good_Example.GoodSphere;

public class InterfaceSegregationPrinciple {

  /*
        Clients should not be forced to depend on interfaces they do not use.
        Encourages the creation of fine grained interfaces, that contains methods that clients would use, and avoids unecessary methods that clients would not use.
        This leads to cleaner and more maintainable code.
    */

  public void badExample() {
    BadSphere sphere = new BadSphere(5);
    System.out.println(sphere.volume());

    BadCircle circle = new BadCircle(5);
    System.out.println(circle.volume());
  }

  public void goodExample() {
    // Implemented two interfaces Shape2D with only area, and Shape3D with area and volume.

    GoodSphere sphere = new GoodSphere(5);
    System.out.println(sphere.area());
    System.out.println(sphere.volume());

    // Circle implements Shape2D, which does not allow us to call the volume method when we have a circle instance.
    GoodCircle circle = new GoodCircle(5);
    System.out.println(circle.area());
  }
}
