using c_sharp_design_patterns.OOP_Principles.Abstraction;
using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Coupling
{
    public class Coupling
    {
        /*
         * Coupling refers to the degree of interdependence between different classes or modules.
         * 
         * Tight coupling means that classes are highly dependent on each other, making it difficult to 
         * modify or maintain them independently. 
         * 
         * Loose coupling, on the other hand, means that classes have minimal dependencies on each other, 
         * allowing for greater flexibility and easier maintenance. This can be done via an abstraction / interface.
         */

        public void TightCouplingExample()
        {
            TightOrder order = new TightOrder();
            order.PlaceOrder(); // Order class is tightly coupled with EmailSender class
        }

        public void LooseCouplingExample()
        {
            INotificationService[] services = {new LooseEmailService(), new SmsService() };
            foreach (INotificationService service in services)
            {
                LooseOrder order = new LooseOrder(service);
                order.PlaceOrder(); // Order class is loosely coupled with INotificationService interface
            }
        }
    }
}
