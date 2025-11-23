using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Abstraction
{
    public class EmailService
    {
        public void SendEmail()
        {
            Connect();
            Authenticate();
            Console.WriteLine("Sending email.");
            Disconnect();
        }

        private void Connect()
        {
            Console.WriteLine("Connecting to email service.");
        }

        private void Authenticate()
        {
            Console.WriteLine("Authenticating user.");
        }

        private void Disconnect()
        {
            Console.WriteLine("Disconnecting from email service.");
        }
    }
}
