package com.codedifferently.bankaccountlab.Accounts;

import java.util.ArrayList;
import com.codedifferently.bankaccountlab.ScanCatcher;
import com.codedifferently.bankaccountlab.Accounts.BankAccount;
import com.codedifferently.bankaccountlab.Accounts.BusinessAccount;
import com.codedifferently.bankaccountlab.Accounts.CheckingAccount;
import com.codedifferently.bankaccountlab.Accounts.SavingsAccount;

/*Class that operates and manages bank accounts*/
public class Atm 
{
    private ScanCatcher scan = new ScanCatcher();
    private ArrayList <BankAccount> totalAccounts = new ArrayList<BankAccount>();

    public Atm()
    {

    }

    private void createAccount()
    {
        System.out.println("What type of account will you create \n 1: Checking 2:Saving 3: Business");
        int choice = scan.nextInt();
        if (choice == 1)
        {
            createChecking();
        }
        else if (choice == 2)
        {
            createSavings();
        }
        else if (choice == 3)
        {
            createBusiness();
        }
        else
        {
            System.out.println("That's not a choice, try again");
            createAccount();
        }
    }
    //Method to set common values shared by all banks such as passwors and account
   private void setCommonBankInfo(BankAccount account)
   {
    System.out.println("What will be this accounts password?");
    account.setPassword(scan.nextInt());

    System.out.println("How much will you deposit");
    account.deposit(scan.nextDouble());
   }
    
   

    private void createChecking()
    {
         
        System.out.println("What name will be used for this account?");
        CheckingAccount checking = new CheckingAccount(scan.next());
        setCommonBankInfo(checking);

        totalAccounts.add(checking);
        System.out.println("Account created, returning to atm start screen");
        startATM();

    }

    private void createSavings()
    {
        System.out.println("What name will be used for this account?");
        SavingsAccount savings = new SavingsAccount(scan.next());
        setCommonBankInfo(savings);

        totalAccounts.add(savings);
        System.out.println("Account created, returning to atm start screen");
        startATM();
    }

    private void createBusiness()
    {
        System.out.println("What name will be used for this account?");
        BusinessAccount business = new BusinessAccount(scan.next());
        setCommonBankInfo(business);

        System.out.println("What is the company's ID number?");
        business.setTaxID(scan.nextInt());
        totalAccounts.add(business);
        System.out.println("Account created, returning to atm start screen");
        startATM();
    }

    //Methods for when ATM is open
    public void startATM()
    {
        System.out.println("Hello what would you like to do today \n 1: Create Account 2: Access Account");
        int choice = scan.nextInt();
        if (choice == 1)
        {
            createAccount();
        }
        else if(choice == 2)
        {
            if (totalAccounts.size() == 0)
            {
                System.out.println("Sorry we have no accounts open, please create one");  
                startATM();
            }
            else
            {
            accessAccount();
            }
        }
        else
        {
            System.out.println("Thats not a choice, try again");
            startATM();
        }
    }

    //Needs to be worked on
    private void accessAccount()
    {
        System.out.println("Enter your account password"); 
        int getPassword = scan.nextInt();
        for (int i = 0; i < totalAccounts.size();i++)
        {
            if (totalAccounts.get(i).getPassword() == getPassword)
            {
                openAccount(totalAccounts.get(i));
                break;
            }
            if ((i == totalAccounts.size()-1) && getPassword != totalAccounts.get(i).getPassword())
            {
                System.out.println("Account not found, try again");
                accessAccount();
            }
        }
    }

    private void openAccount(BankAccount account)
    {
        System.out.println(account); 
        System.out.println("What would you like to do 1: Deposit 2: Withdraw 3: Delete Account 4: Close ATM");
        int choice = scan.nextInt();
        if (choice == 1)
        {
            depositAccount(account);
        }
        if (choice == 2)
        {
            withdrawAccount(account); 
        }
        if (choice == 3)
        {
            deleteAccount(account);
        }
        if (choice == 4)
        {
            closeATM();
        }


    }

    private void depositAccount(BankAccount account)
    {
        System.out.println("How much will you deposit");
        double moneyDeposit = scan.nextDouble();
        account.deposit(moneyDeposit);
        System.out.println("$"+moneyDeposit+" has been added to your account");
        openAccount(account);

    }

    private void withdrawAccount(BankAccount account)
    {
        System.out.println("How much will you withdraw");
        double moneyWithdraw = scan.nextDouble();
        account.deposit(moneyWithdraw);
        System.out.println("$"+moneyWithdraw+" has been removed from your account");
        openAccount(account);
    }

    private void deleteAccount(BankAccount account)
    {
        for (int i = 0; i < totalAccounts.size();i++)
        {
            if (totalAccounts.get(i) == account)
            {
                System.out.println("The account has been deleted");
                totalAccounts.remove(i);
                closeATM();
                break;
            }
        }
    }

    

    private void closeATM()
    {
        System.out.println("Thank you come again"); 
    }
}