package OOP_Principles.Encapsulation;

public class BankAccount {

  private double balance;

  public BankAccount(double balance) {
    Deposit(balance);
  }

  public double getBalance() {
    return balance;
  }

  public void Deposit(double amount) {
    if (amount <= 0) {
      System.out.println("Deposit must be positive.");
      return;
    }
    balance += amount;
  }

  public void Withdraw(double amount) {
    if (amount <= 0) {
      System.out.println("Withdraw amount must be positive.");
      return;
    }

    if (amount > balance) {
      System.out.println("Withdraw amount greater than balance.");
      return;
    }

    balance -= amount;
  }
}
