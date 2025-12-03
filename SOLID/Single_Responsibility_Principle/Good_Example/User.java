package SOLID.Single_Responsibility_Principle.Good_Example;

public class User {

  // Used to store user information and provides access to that data

  private String username;
  private String email;

  public User(String username, String email) {
    this.username = username;
    this.email = email;
  }

  public String getUsername() {
    return this.username;
  }

  public String getEmail() {
    return this.email;
  }
}
