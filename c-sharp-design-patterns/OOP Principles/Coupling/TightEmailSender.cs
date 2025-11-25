using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Coupling
{
    public class TightEmailSender
    {
        public void SendEmail(string message)
        {
            Console.WriteLine("Sending email: " + message);
        }
    }
}
