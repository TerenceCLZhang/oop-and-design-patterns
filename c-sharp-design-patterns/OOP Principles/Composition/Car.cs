using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Composition
{
    public class Car
    {
        private Chassis chassis = new Chassis();
        private Engine engine = new Engine();
        private Seats seats = new Seats();
        private Wheels wheels = new Wheels();

        public void StartCar()
        {
            chassis.Support();
            seats.Sit();
            engine.Start();
            wheels.Rotate();
            Console.WriteLine("Car has started.");
        }
    }
}
