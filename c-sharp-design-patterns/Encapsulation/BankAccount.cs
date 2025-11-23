using System;
using System.Collections.Generic;
using System.Text;

namespace c_sharp_design_patterns.Encapsulation
{
    public class BankAccount
    {
        private double balance;

        public BankAccount(double balance)
        {
            Deposit(balance);
        }

        public double getBalance()
        {
            return balance;
        }

        public void Deposit(double amount)
        {
            if (amount <= 0)
            {
                throw new ArgumentException("Deposit must be positive.");
            }
            balance += amount;
        }

        public void Withdraw(double amount)
        {
            if (amount <= 0)
            {
                throw new ArgumentException("Withdraw amount must be positive.");
            }

            if (amount > balance)
            {
                throw new ArgumentException("Withdraw amount greater than balance.");
            }

            balance -= amount;
        }
    }
}
