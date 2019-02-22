/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackSource;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SeaSpear
 */
public class StackTest extends Stack{
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        int capacity = 5;
        int[] arr1 = Stack();
        assertEquals(arr1.length, 20);
        int[] arr2 = Stack(capacity);
        assertEquals(arr2.length, capacity);
        
        
    }
    
}
