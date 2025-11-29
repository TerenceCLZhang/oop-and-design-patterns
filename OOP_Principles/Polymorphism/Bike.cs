using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Polymorphism
{
    public class Bike : Vehicle
    {
        public override void Honk()
        {
            Console.WriteLine("Bike is honking...");
        }
    }
}
