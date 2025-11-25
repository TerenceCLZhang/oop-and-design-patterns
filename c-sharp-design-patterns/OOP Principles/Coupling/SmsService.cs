using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Coupling
{
    internal class SmsService : INotificationService
    {
        public void SendNotification(string message)
        {
            Console.WriteLine("Sending SMS: " + message);
        }
    }
}
