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
public class ClientTest {
    
    public ClientTest() {
    }


    /**
     * Test of equals method, of class Client.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals1");
        Object obj = null;
        Client instance = new Client();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals2() {
        System.out.println("equals2");
        
        Client instance = new Client();
        Object obj = instance;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals3() {
        System.out.println("equals3");
        Object obj = null;
        Client instance = new Client("fadwa","shalaby");;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals4() {
        System.out.println("equals4");
        Object obj = new Client("fadwa","shalaby");
        Client instance = new Client("fadwa","shalaby");
        instance.setId(((Client)obj).getId());
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals5() {
        System.out.println("equals5");
        Object obj =new Client("fadwa","hello");
        Client instance = new Client("fadwa","shalaby");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
 
}
