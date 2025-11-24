using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Inheritance
{
    public class Bike : Vehicle
    {
        public bool HasPedals { get; }

        public Bike(string brand, string model, int year, bool hasPedals)
            : base(brand, model, year)
        {
            HasPedals = hasPedals;
        }
    }
}
