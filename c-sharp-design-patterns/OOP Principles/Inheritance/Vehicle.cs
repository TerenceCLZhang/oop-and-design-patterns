using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Inheritance
{
    public class Vehicle
    {
        public string Brand { get; }
        public string Model { get; }
        public int Year { get; }

        public Vehicle(string brand, string model, int year)
        {
            Brand = brand;
            Model = model;
            Year = year;
        }


        public void Start()
        {
            Console.WriteLine("Vehicle is start...");
        }

        public void Stop()
        {
            Console.WriteLine("Vehicle is stop...");
        }
    }
}
