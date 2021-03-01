/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author OMEN
 */
public class ArrayLTest {
    
    public ArrayLTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of push method, of class ArrayL.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = 10;
        ArrayL instance = new ArrayL();
        instance.push(e);
        
    }

    /**
     * Test of pop method, of class ArrayL.
     */
    @Test
    public void testPop() {
        /*System.out.println("pop");
        ArrayL instance = new ArrayL();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        */
    }

    /**
     * Test of size method, of class ArrayL.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayL instance = new ArrayL();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }
    
}
