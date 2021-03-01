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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of calculo method, of class Calculadora.
     */
    @Test
    public void testCalculo() {
        /*
        System.out.println("calculo");
        String aString = "(3+5)";
        Calculadora instance = null;
        String expResult = "3+5";
        String result = instance.calculo(aString);
        assertEquals(expResult, result);
        */
    }

    /**
     * Test of verif method, of class Calculadora.
     */
    @Test
    public void testVerif() {
        System.out.println("verif");
        char c = '+';
        int expResult = 1;
        int result = Calculadora.verif(c);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of infixtoPostfix method, of class Calculadora.
     */
    @Test
    public void testInfixtoPostfix() {
        System.out.println("infixtoPostfix");
        String parametro = "";
        String expResult = "";
        String result = Calculadora.infixtoPostfix(parametro);
        assertEquals(expResult, result);
        
    }
    
}
