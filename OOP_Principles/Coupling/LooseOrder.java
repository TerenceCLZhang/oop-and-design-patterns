package OOP_Principles.Coupling;

public class LooseOrder {

  private final NotificationService notificationService;

  public LooseOrder(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public void PlaceOrder() {
    this.notificationService.SendNotification("Your order has been placed.");
  }
}
