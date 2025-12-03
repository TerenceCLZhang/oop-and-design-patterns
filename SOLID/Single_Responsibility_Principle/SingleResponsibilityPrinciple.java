package SOLID.Single_Responsibility_Principle;

import SOLID.Single_Responsibility_Principle.Bad_Example.BadUser;
import SOLID.Single_Responsibility_Principle.Good_Example.User;
import SOLID.Single_Responsibility_Principle.Good_Example.UserRegistrationService;

public class SingleResponsibilityPrinciple {

  /*
    A class should have only one reason to change, meaning it should hav eonly one responsibility or purpose.
    */

  public void badExample() {
    BadUser badUser = new BadUser();
    badUser.Register("John Doe", "johndoe@email.com");
  }

  public void goodExample() {
    User user = new User("Jane Doe", "janedoe@email.com");
    EmailSender emailSender = new EmailSender();
    UserRegistrationService userRegistrationService =
      new UserRegistrationService(emailSender);
    userRegistrationService.Register(user);
  }
}
