package com.codedifferently.bankaccountlab;

import static org.junit.Assert.assertEquals;

import com.codedifferently.bankaccountlab.Accounts.SavingsAccount;

import org.junit.Test;

public class SavingsAccountTest 
{
    
    @Test
    public void constructorTest()
    {
        SavingsAccount savings = new SavingsAccount();

        savings.setName("Go");
      
    }

    @Test
    public void getNameTest()
    {
        SavingsAccount savings = new SavingsAccount();
        savings.setName("Randy"); 

        String expectedName = "Randy";

        String actualName =  savings.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getRateTest()
    {
        SavingsAccount savings = new SavingsAccount();
        savings.setRate(2.5);

        double expectedRates = 2.5;

        assertEquals(expectedRates, savings.getRate(),0);
    }
}