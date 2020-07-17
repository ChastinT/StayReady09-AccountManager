package com.codedifferently.bankaccountlab.Accounts;


public class CheckingAccount extends BankAccount 
{
    private String name;


    public CheckingAccount()
    {
        accountSetter++;
        this.accountNumber = accountSetter;
        this.type = "Checking";
        this.fees = 3.5;
    }

    public CheckingAccount(String name)
    {
        
        accountSetter++;
        this.accountNumber = accountSetter;
        this.name = name;
        this.type = "Checking";
        this.fees = 3.5;
    }

    //Getters and Setters or Encapsulation
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Owner of account: "+this.name+"\n"+super.toString();
    }
}