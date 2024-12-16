/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package banking;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fadwa
 */
public class AccountTest {
    
    public AccountTest() {
    }


    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit1() {
        System.out.println("deposit1");
        double d = 50.0;
        Account instance = new AccountImpl();
        double expResult = 50.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result,0);
    }
    
     @Test
    public void testDeposit2() {
        System.out.println("deposit2");
        double d = -110.0;
        Account instance = new AccountImpl();
        double expResult = 0.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
     @Test
    public void testDeposit3() {
        System.out.println("deposit3");
        double d = 0.0;
        Account instance = new AccountImpl();
        double expResult = 0.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
     @Test
    public void testDeposit4() {
        System.out.println("deposit4");
        double d = 520.54;
        Account instance = new AccountImpl();
        double expResult = 520.54;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
    
     @Test
    public void testDeposit5() {
        System.out.println("deposit5");
        double d = 1000000.0;
        Account instance = new AccountImpl();
        double expResult = 1000000.0;
        double result = instance.deposit(d);
        assertEquals(expResult, result, 0);
    }
   


    /**
     * Test of withdrawal method, of class Account.
     */
    @Test
    public void testWithdrawal1() {
        System.out.println("withdrawal1");
        double w = -50.0;
        Account instance = new AccountImpl();
        double expResult = 0.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
      @Test
    public void testWithdrawal2() {
        System.out.println("withdrawal2");
        double w = 20.0;
        Account instance = new AccountImpl();
        double expResult = -20.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
      @Test
    public void testWithdrawal3() {
        System.out.println("withdrawal3");
        double w = 300000.0;
        Account instance = new AccountImpl();
        double expResult = -300000.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
      @Test
    public void testWithdrawal4() {
        System.out.println("withdrawal4");
        double w = 123.45;
        Account instance = new AccountImpl();
        double expResult = -123.45;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }
    
      @Test
    public void testWithdrawal5() {
        System.out.println("withdrawal5");
        double w = 54332211.0;
        Account instance = new AccountImpl();
        double expResult = -54332211.0;
        double result = instance.withdrawal(w);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals1");
        Object obj = null;
        Account instance = new AccountImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
      @Test
    public void testEquals2() {
        System.out.println("equals2");
        Account smth=new AccountImpl();
        Object obj = smth;
        Account instance = new AccountImpl();
        instance.setAccountNumber(((Account)obj).getAccountNumber());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testEquals3() {
        System.out.println("equals3");
        Account smth=new AccountImpl();
        Object obj = null;
        Account instance = new AccountImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testEquals4() {
        System.out.println("equals4");
        Account smth=new AccountImpl();
        Object obj = smth;
        Account instance = new AccountImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testEquals5() {
        System.out.println("equals5");
        Account thing=new AccountImpl();
        Object obj = thing;
        Account instance = new AccountImpl();
        instance.setAccountNumber(((Account)obj).getAccountNumber());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    public class AccountImpl extends Account {
    }
    
}
