package SOLID.Single_Responsibility_Principle;

public class EmailSender {

  public void sendEmail(String email, String message) {
    System.out.printf("Sending email to %s: %s\n", email, message);
  }
}
