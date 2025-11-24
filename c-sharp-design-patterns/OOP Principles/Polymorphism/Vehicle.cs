using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Polymorphism
{
    public class Vehicle
    {
        public virtual void Honk()
        {
            Console.WriteLine("Vehicle honking...");
        }
    }
}
