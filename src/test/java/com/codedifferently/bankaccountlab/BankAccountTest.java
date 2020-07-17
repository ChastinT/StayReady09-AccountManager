package com.codedifferently.bankaccountlab;

import static org.junit.Assert.assertEquals;

import com.codedifferently.bankaccountlab.Accounts.BankAccount;
import com.codedifferently.bankaccountlab.Accounts.CheckingAccount;
import com.codedifferently.bankaccountlab.Accounts.SavingsAccount;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest 
{
    BankAccount checkAcc = new CheckingAccount();
    @Before
    public void initialize()
    {
        ((CheckingAccount)checkAcc).setName("Nadiya");
        checkAcc.setBalance(200);
        checkAcc.setFees(4);
        
    }

    @Test
    public void depositTest()
    {
        double expectedDouble = 250;

        checkAcc.deposit(50);

        double actualDouble = checkAcc.getBalance();

        assertEquals(expectedDouble, actualDouble,0);
    }

    @Test
    public void withdrawTest()
    {
        double expectedDouble = 150;

        checkAcc.withdraw(50);

        double actualDouble = checkAcc.getBalance();

        assertEquals(expectedDouble, actualDouble,0);
    }

    @Test
    public void getIDTest()
    {
        BankAccount checkAcc = new CheckingAccount();
        
        int expectedID = 2;

        int actualID = checkAcc.getAccountNumber();

        assertEquals(expectedID, actualID);
    }


    @Test
    public void getFeesTest()
    {
            BankAccount checkAcc = new CheckingAccount();
            checkAcc.setFees(2.4);
            
            double expected = 2.4;
    
            double actual = checkAcc.getFees();
    
            assertEquals(expected, actual,0);
    }

    @Test
    public void getBalanceTest()
    {
            BankAccount checkAcc = new CheckingAccount();
            checkAcc.setBalance(345.5);
            
            double expected = 345.5;
    
            double actual = checkAcc.getBalance();
    
            assertEquals(expected, actual,0);
    }

    @Test
    public void getPasswordTest()
    {
            BankAccount checkAcc = new SavingsAccount();
            checkAcc.setPassword(12345);
            
            int expected = 12345;
    
            int actual = checkAcc.getPassword();
    
            assertEquals(expected, actual,0);
    }

    @Test
    public void getTypeTest()
    {
            BankAccount checkAcc = new CheckingAccount();
            
            
            String expected = "Checking";
    
         
    
            assertEquals(expected, checkAcc.getType());
    }
    
    
}
