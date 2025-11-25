using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Coupling
{
    public class TightOrder
    {
        public void PlaceOrder()
        {
            TightEmailSender emailSender = new TightEmailSender(); // This causes tight coupling with EmailSender
            emailSender.SendEmail("Your order has been placed.");
        }
    }
}
