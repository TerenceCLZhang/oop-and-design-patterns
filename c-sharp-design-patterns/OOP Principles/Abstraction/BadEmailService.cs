using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Abstraction
{
    public class BadEmailService
    {
        public void Connect()
        {
            Console.WriteLine("Connecting to email service.");
        }

        public void Authenticate()
        {
            Console.WriteLine("Authenticating user.");
        }

        public void SendEmail()
        {
            Console.WriteLine("Sending email.");
        }

        public void Disconnect()
        {
            Console.WriteLine("Disconnecting from email service.");
        }

    }
}
