package SOLID.Single_Responsibility_Principle;

public class BadUser {

  // Violates SRP: this class handles multiple responsibilities —
  // 1) storing user data,
  // 2) performing the registration workflow (printing/logging),
  // 3) sending emails through EmailSender.
  // A User class should only represent user data, not manage registration or external services.

  private String username;
  private String email;

  public void Register(String username, String email) {
    this.username = username;
    this.email = email;

    System.out.printf("User %s has been registered%n", this.username);

    EmailSender emailSender = new EmailSender();
    emailSender.sendEmail(this.email, "Welcome to our platform!");
  }
}
