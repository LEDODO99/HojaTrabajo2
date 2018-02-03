/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */
public class CalculosTest {
    
    public CalculosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of operar method, of class Calculos.
     */
    @Test
    public void testOperar() {
        System.out.println("operar");
        String expresion = "3 4 + 6 5 * - 2 /";
        Calculos instance = new Calculos();
        double expResult = -11.5;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
        if (result != expResult)
        {
            fail("La prueba ha fallado.");
        }
    }
    
}
