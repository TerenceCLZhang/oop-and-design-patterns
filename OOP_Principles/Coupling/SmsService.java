package OOP_Principles.Coupling;

public class SmsService implements NotificationService {

  public void SendNotification(String message) {
    System.out.println("Sending SMS: " + message);
  }
}
