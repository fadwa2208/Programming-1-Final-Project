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
public class BankTest {
    
    public BankTest() {
    }
    /**
     * Test of equals method, of class Bank.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals1");
        Object obj = null;
        Bank instance = new Bank();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals2() {
        System.out.println("equals2");
        Object obj = new Bank("lolbank321","321");
        Bank instance = new Bank("lolbank321","321");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals3() {
        System.out.println("equals3");
        Object obj = null;
        Bank instance = new Bank("lolbank123","0123");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals4() {
        System.out.println("equals4");
        Object obj = new Bank("lolbank123","123");
        Bank instance = new Bank("lolbank321","321");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals5() {
        System.out.println("equals5");
        Object obj = new Bank("lol bank321","3 21");
        Bank instance = new Bank("lol bank321","3 21");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
