package OOP_Principles.Coupling;

public class LooseEmailService implements NotificationService {

  public void SendNotification(String message) {
    System.out.println("Sending email: " + message);
  }
}
