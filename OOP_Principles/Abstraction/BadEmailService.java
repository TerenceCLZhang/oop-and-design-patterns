package OOP_Principles.Abstraction;

public class BadEmailService {

  public void Connect() {
    System.out.println("Connecting to email service.");
  }

  public void Authenticate() {
    System.out.println("Authenticating user.");
  }

  public void SendEmail() {
    System.out.println("Sending email.");
  }

  public void Disconnect() {
    System.out.println("Disconnecting from email service.");
  }
}
