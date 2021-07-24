/*
Name: young cheol ko
Class: CS55
Project 6
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;

//create account1 for Sally with $1000 acct1 = new Account(1000, "Sally", 1111);
        acct1 = new Account(1000, "Sally", 1111);
//create account2 for Joe with $500
        acct2 = new Account(500, "Joe", 1112);
//deposit $100 to Joe's account
        acct2.deposit(100);
//print Joe's new balance (use getBalance())
        System.out.println("acct2's balance is " + acct2.getBalance());
//withdraw $50 from Sally's account
        acct1.withdraw(50);
//print Sally's new balance (use getBalance())
        System.out.println("acct1's balance is " + acct1.getBalance());
//charge fees to both accounts
        System.out.println("acct1's Balance after Charging Fee : " + acct1.chargeFee());
        System.out.println("acct2's Balance after Charging Fee : " + acct2.chargeFee());
//change the name on Joe's account to Joseph
        acct2.changeName("Joseph");
//print summary for both accounts
        System.out.println("Account 1 summary :\n" + acct1.toString());
        System.out.println("Account 2 summary :\n" + acct2.toString());
    }
}

