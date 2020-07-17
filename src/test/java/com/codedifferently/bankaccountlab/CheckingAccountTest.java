package com.codedifferently.bankaccountlab;

import static org.junit.Assert.assertEquals;

import com.codedifferently.bankaccountlab.Accounts.CheckingAccount;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class CheckingAccountTest 
{

    @Test
    public void constructorTest()
    {
        CheckingAccount checking = new CheckingAccount();
        checking.setName("Randy");
        checking.setBalance(200);
        checking.setFees(100);

        String expectedName = "Randy";
        double expectedBalance = 200;
        double expectedFees = 100;

        String actualName = checking.getName();
        double actualBalance = checking.getBalance();
        double actualFees = checking.getFees();
        
        assertEquals(expectedName, actualName);
        assertEquals(expectedBalance, actualBalance,0);
        assertEquals(expectedFees, actualFees,0);
    }

    @Test
    public void getNameTest()
    {
        CheckingAccount checking = new CheckingAccount();
        checking.setName("Randy"); 

        String expectedName = "Randy";

        String actualName = checking.getName();
        assertEquals(expectedName, actualName);

    }

   
}