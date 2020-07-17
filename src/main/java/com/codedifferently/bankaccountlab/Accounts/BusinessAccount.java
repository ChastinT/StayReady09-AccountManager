package com.codedifferently.bankaccountlab.Accounts;

public class BusinessAccount extends BankAccount
{
    private String company;
    private int taxID;

    public BusinessAccount()
    {
        accountSetter++;
        this.accountNumber = accountSetter;
        this.type = "Business";
        this.fees = 8.4;
    }

    public BusinessAccount(String company)
    {
        accountSetter++;
        this.accountNumber = accountSetter;
        this.company = company;
        this.type = "Business";
        this.fees = 8.4;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getCompany()
    {
        return company;
    }

    public void setTaxID(int taxID)
    {
        this.taxID = taxID;
    }

    public int getTaxID()
    {
        return taxID;
    }

    @Override
    public String toString()
    {
        return "Company Name: "+this.company+"\n"+"Company TaxID: "+this.taxID+"\n"+super.toString();
    }
}