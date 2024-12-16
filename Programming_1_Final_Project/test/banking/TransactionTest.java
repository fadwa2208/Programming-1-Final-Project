/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package banking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fadwa
 */
public class TransactionTest {
    
    public TransactionTest() {
    }


    /**
     * Test of equals method, of class Transaction.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals1");
        Object obj = null;
        Transaction instance = new Transaction();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals2() {
        System.out.println("equals2");
        
        Transaction instance = new Transaction();
        Object obj = instance;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals3() {
        System.out.println("equals3");
        
        Transaction instance = new Transaction("deposit",50);
        Object obj = new Transaction("deposit",50);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals4() {
        System.out.println("equals4");
        
        Transaction instance = new Transaction("deposit",50);
        Object obj = new Transaction("withdrawal",50.5);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals5() {
        System.out.println("equals5");
        
        Transaction instance = new Transaction("withdrawal",25.50);
        Object obj = new Transaction("withdrawal",25.50);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
