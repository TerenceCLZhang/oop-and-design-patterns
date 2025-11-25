using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Coupling
{
    public class LooseEmailService : INotificationService
    {
        public void SendNotification(string message)
        {
            Console.WriteLine("Sending email: " + message);
        }
    }
}
