package OOP_Principles.Coupling;

public class TightOrder {

  public void PlaceOrder() {
    TightEmailSender emailSender = new TightEmailSender(); // This causes tight coupling with EmailSender
    emailSender.SendEmail("Your order has been placed.");
  }
}
