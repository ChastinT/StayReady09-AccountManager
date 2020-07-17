package com.codedifferently.bankaccountlab.Accounts;

public abstract class BankAccount 
{
    protected static int accountSetter = 0; //Static int to set the accountNumber based on number of account objects
    protected int accountNumber = 0 ;
    protected String type;
    protected double fees;
    protected double balance = 0 ;
    protected int password;

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getFees()
    {
        return fees;
    }

    public void setFees(double fees)
    {
        this.fees = fees;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double deposit)
    {
        this.balance += deposit;
    }

    public void withdraw(double withdraw)
    {
        this.balance -= withdraw;
    }

    public void setPassword(int password)
    {
        this.password = password;
    }
    public int getPassword()
    {
        return this.password;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }

    @Override
    public String toString() 
    {
        String output = "Account Number: "+getAccountNumber()+"\n"+"Type of Account: "+getType()+"\n"+"Fees: "+getFees()+"\n"+"Balance: $"+getBalance();
        return output;
    }
    
}
