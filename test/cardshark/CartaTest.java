/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardshark;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rojas
 */
public class CartaTest {
    
    public CartaTest() {
    }

    /**
     * Test of getValor method, of class Carta.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFigura method, of class Carta.
     */
    @Test
    public void testGetFigura() {
        System.out.println("getFigura");
        Carta instance = null;
        Figura expResult = null;
        Figura result = instance.getFigura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Carta.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Carta instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Carta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Carta instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Carta.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Carta c = null;
        Carta instance = null;
        int expResult = 0;
        int result = instance.compareTo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
