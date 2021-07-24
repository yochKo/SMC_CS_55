/*
Name: young cheol ko
Class: CS55
Project 6
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

import java.util.Date;

public class Account {
    private double balance;
    private String name;
    private long acctNum;
    private String dateCreated;
//----------------------------------------------

//Constructor -- initializes balance, owner, and account number

//----------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;

        Date date=new Date();
        dateCreated=date.toString();
    }
//----------------------------------------------


// Checks to see if balance is sufficient for withdrawal.

// If so, decrements balance by amount; if not, prints message.

//----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

//----------------------------------------------

// Adds deposit amount to balance.

//----------------------------------------------

    public void deposit(double amount) {
        balance += amount;
    }

//----------------------------------------------

// Returns balance.

//----------------------------------------------

    public double getBalance() {
        return balance;
    }

//----------------------------------------------

// Returns a string containing the name, account number, and balance.

//----------------------------------------------

    public String toString() {
        String to_string = "Name : "+this.name + "\nAccount number : " + this.acctNum + "\nBalance: " + this.balance + "\nThe date : " + dateCreated;
        return to_string;
    }

//----------------------------------------------

// Deducts $10 service fee

//----------------------------------------------

    public double chargeFee() {
        this.balance-=10;
        return this.balance;
    }

//----------------------------------------------

// Changes the name on the account

//----------------------------------------------

    public void changeName(String newName) {
        this.name=newName;
    }
}