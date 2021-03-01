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
public class Vector_Test {
    
    public Vector_Test() {
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
     * Test del método push, de la clase Vector_.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = 45;
        Vector_ instance = new Vector_();
        instance.push(e);
        
    }

    /**
     * Test del método pop, de la clase Vector_.
     */
    @Test
    public void testPop() {
        /*System.out.println("pop");
        Vector_ instance = new Vector_();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        */
    }

    
    
    
    /**
     * Test del metodo size, de la clase Vector_.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Vector_ instance = new Vector_();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }
    
}
