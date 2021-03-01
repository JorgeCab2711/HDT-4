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
public class SingleLinkedListTest {
    
    public SingleLinkedListTest() {
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
     * Test of push method, of class SingleLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = 25;
        SingleLinkedList instance = new SingleLinkedList();
        instance.push(e);
        
    }

    /**
     * Test of pop method, of class SingleLinkedList.
     */
    @Test
    public void testPop() {
        //System.out.println("pop");
        //SingleLinkedList instance = new SingleLinkedList();
        //Object expResult = null;
        //Object result = instance.pop();
        //assertEquals(expResult, result);
        
        //Object e = 25;
        //SingleLinkedList instance = new SingleLinkedList();
        //instance.pop();
        
        
        
        //System.out.println("pop");
        //SingleLinkedList instance = new SingleLinkedList();
        //Object e = 1;
        //instance.pop();
        
    }

    /**
     * Test of size method, of class SingleLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SingleLinkedList instance = new SingleLinkedList();
        Object e = 1;
        instance.push(e);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }
    
}
