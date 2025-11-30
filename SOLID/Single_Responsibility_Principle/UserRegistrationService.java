package SOLID.Single_Responsibility_Principle;

public class UserRegistrationService {

  // One clear responsibility of handling user registration workflows

  private EmailSender emailSender;

  public UserRegistrationService(EmailSender emailSender) {
    this.emailSender = emailSender;
  }

  public void Register(User user) {
    System.out.printf("User %s has been registered%n", user.getUsername());
    emailSender.sendEmail(user.getEmail(), "Welcome to our platform!");
  }
}
