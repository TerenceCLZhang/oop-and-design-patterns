package OOP_Principles.Abstraction;

public class EmailService {

  public void SendEmail() {
    Connect();
    Authenticate();
    System.out.println("Sending email.");
    Disconnect();
  }

  private void Connect() {
    System.out.println("Connecting to email service.");
  }

  private void Authenticate() {
    System.out.println("Authenticating user.");
  }

  private void Disconnect() {
    System.out.println("Disconnecting from email service.");
  }
}
