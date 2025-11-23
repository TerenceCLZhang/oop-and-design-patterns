using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.OOP_Principles.Encapsulation
{
    public class Encapsulation
    {

        /* Encapsulation means bundling data and the methods that operate on that data into a single unit or class,
         * and restricting direct access to internal state.
         */

       public void RunBadExample()
       {
           /* 
            * The code above demonstrates a poor practice: exposing the balance field directly.
            * This breaks encapsulation because external code can assign invalid values(e.g., a negative balance).
            */

        BadBankAccount badAccount = new BadBankAccount();
            badAccount.balance = -50;
            Console.WriteLine(badAccount.balance); // -50 (invalid state)
        }

        public void RunGoodExample()
        {
            /*
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
        }
    }
}
