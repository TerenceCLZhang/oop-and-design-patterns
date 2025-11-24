using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Inheritance
{
    public class Car : Vehicle
    {
        public int NumberOfDoors { get; }

        public Car(string brand, string model, int year, int numberOfDoors) : base(brand, model, year)
        {
            NumberOfDoors = numberOfDoors;
        }
    }
}
