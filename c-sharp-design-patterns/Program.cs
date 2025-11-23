// Encapsulation

using c_sharp_design_patterns.Encapsulation;

//BadBankAccount badAccount = new BadBankAccount();
//badAccount.balance = -50;
//Console.WriteLine(badAccount.balance);

/*
 * The code above demonstrates a poor practice: exposing the balance field directly.
 * This breaks encapsulation because external code can assign invalid values (e.g., a negative balance).
 *
 * To enforce proper encapsulation, the balance field is marked as private, and all access to it is 
 * controlled through public methods. These methods—such as Deposit and Withdraw—ensure that any changes 
 * to the balance follow the rules and constraints of the business logic, preventing the object from 
 * entering an invalid state.
 */

BankAccount bankAccount = new BankAccount(100);
Console.WriteLine(bankAccount.getBalance()); // 100
bankAccount.Deposit(50);
Console.WriteLine(bankAccount.getBalance()); // 150
bankAccount.Withdraw(100);
Console.WriteLine(bankAccount.getBalance()); // 50

