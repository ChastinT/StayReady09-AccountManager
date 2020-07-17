package com.codedifferently.bankaccountlab;

import java.util.InputMismatchException;
import java.util.Scanner;

//Class that uses a scan to catch errors, use the names of scan methods that we'll use
public class ScanCatcher 
{
     Scanner scan = new Scanner(System.in);

    public ScanCatcher()
    {

    }

    public int nextInt() 
    {
        int result = 0;
        boolean notValid = false;
        while(!notValid) 
        {
            try
            {
                    scan = new Scanner(System.in);
           
                    if (scan.hasNextInt())
                    {
                        result = scan.nextInt();
                        notValid = true;
                    }
                    else
                    {
                        System.out.println("This is not a int, try again");
                    }
                    
            }
            
            catch (InputMismatchException e) 
           { 
                
                scan.next();
           }
        }
        
           return result;
     
    }

    public String next()//Universal
    {
       return scan.next();
    }

    public void close()
    {
        scan.close();
    }

    public String nextLine()//Universal
    {
       return scan.nextLine();
    }

    public double nextDouble() 
    {
        double result = 0;
        boolean notValid = false;
        while(!notValid) 
    {
        try
        {
                scan = new Scanner(System.in);
       
                if (scan.hasNextDouble())
                {
                    result = scan.nextDouble();
                    notValid = true;
                }
                else
                {
                    System.out.println("This is not a double, try again");
                }
                
        }
        
        catch (InputMismatchException e) 
       { 
            
            scan.next();
       }
    }
    
       return result;
     
    }
    
}