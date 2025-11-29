package OOP_Principles.Abstraction;

public class Abstraction {

  /*
   * Abstraction simplifies complex systems by hiding unnecessary details and exposing
   * only the essential features.
   */

  public void BadExample() {
    /*
     * BadEmailService exposes too many internal steps, forcing the user to understand and
     * manually perform the correct sequence. This leaks implementation details, increases
     * complexity, and allows for potential misuse.
     */

    BadEmailService badEmailService = new BadEmailService();
    badEmailService.Connect();
    badEmailService.Authenticate();
    badEmailService.SendEmail();
    badEmailService.Disconnect();
  }

  public void GoodExample() {
    /*
     * EmailService provides good abstraction because it hides all internal operations
     * and exposes only the essential action: SendEmail(). This class handles connection,
     * authentication, sending, and disconnection internally, giving the user a simple,
     * safe, and intention-based interface.
     */
    EmailService emailService = new EmailService();
    emailService.SendEmail();
  }
}
