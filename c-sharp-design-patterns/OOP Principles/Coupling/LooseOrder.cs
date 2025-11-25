using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Coupling
{
    public class LooseOrder
    {

        private readonly INotificationService notificationService;

        public LooseOrder(INotificationService notificationService)
        {
            this.notificationService = notificationService;
        }

        public void PlaceOrder()
        {
            notificationService.SendNotification("Your order has been placed.");
        }
    }
}
