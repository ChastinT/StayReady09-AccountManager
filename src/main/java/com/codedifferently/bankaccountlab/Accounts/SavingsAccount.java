package com.codedifferently.bankaccountlab.Accounts;

public class SavingsAccount extends BankAccount
{
    private String name;
    private double rate = 4.5;

    public SavingsAccount()
    {
        accountSetter++;
        this.accountNumber = accountSetter;
        this.type = "Savings";
        this.fees = 2.5;
    }

    public SavingsAccount(String name)
    {
        accountSetter++;
        this.accountNumber = accountSetter;
        this.name = name;
        this.type = "Savings";
        this.fees = 2.5;
    }

    //Getters and Setters or Encapsulation
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getRate()
    {
        return rate;
    }

    @Override
    public String toString()
    {
        return  "Owner of account: "+this.name+"\n"+super.toString()+"\n"+"Rate: "+this.rate;
    }
}