using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Polymorphism
{
    public class Polymorphism
    {
        /*
         * Polymorphism is the ability of an object to take many forms.
         */

        public void Example()
        {
            List<Vehicle> vehicles = new List<Vehicle>();
            vehicles.Add(new Car()); // Honk is base implementation
            vehicles.Add(new Bike());
            vehicles.Add(new Boat());

            foreach (Vehicle vehicle in vehicles)
            {
                vehicle.Honk();
            }
        }
    }
}
