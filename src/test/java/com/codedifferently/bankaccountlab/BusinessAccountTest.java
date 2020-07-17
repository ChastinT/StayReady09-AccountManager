package com.codedifferently.bankaccountlab;

import static org.junit.Assert.assertEquals;

import com.codedifferently.bankaccountlab.Accounts.BusinessAccount;

import org.junit.Before;
import org.junit.Test;

public class BusinessAccountTest 
{
    BusinessAccount business;
    @Before
    public void initialize()
    {
        business = new BusinessAccount("Ink");
        business.setTaxID(123);
    
    }
    @Test
    public void companyNameTest()
    {
        String expected = "Ink";

        assertEquals(expected, business.getCompany());
    }

    @Test
    public void taxIDTest()
    {
        int expected = 123;

        assertEquals(expected, business.getTaxID());
    }
}