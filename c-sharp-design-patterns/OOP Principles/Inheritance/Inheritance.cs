using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Inheritance
{
    public class Inheritance
    {
        /*
         * Inheritance involves creating new classes (subclass or derived class) based on existing classes 
         * (superclass or base class). Subclasses inherit properties and behaviours from their suplerclasses 
         * and can also add new features or override existing ones. Inheritance is often described in terms 
         * as an "is-a" relationship.
         */

        public void Example()
        {
            Car car = new Car("Ford", "Mustang", 2025, 4);
            Bike bike = new Bike("Harley Davidson", "Touring", 2021, false);

            car.Start();
            bike.Start();

            Console.WriteLine($"Car has {car.NumberOfDoors} doors.");
            Console.WriteLine($"Bike {(bike.HasPedals ? "has" : "does not have")} pedals.");

            car.Stop();
            bike.Stop();
        }
    }
}
