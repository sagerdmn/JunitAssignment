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
    public void testSomeMethod() throws EmptyStackException, FullStackException {
        // TODO review the generated test code and remove the default call to fail.
        int capacity = 5;
        //default stack constructor
        Stack stack1 = new Stack();
        assertEquals(Stack.arr.size(), 20);
        //parameterized stack
        Stack stack2 = new Stack(capacity);
        assertEquals(Stack.arr.size(), capacity);
        //check for accuracy of returned value for pop()
        assertEquals(stack1.pop(),stack1.arr.get(0).number);
        //check for accuracy of returned value for peek()
        assertEquals(stack1.peek(),stack1.arr.get(0).number);
        //testing empty()
        assertEquals(stack1.empty(), false);
        //testing push
        Item test = new Item(3);
        stack1.push(test);
        assertEquals(stack1.peek(), 3);
        
    }
    
}
