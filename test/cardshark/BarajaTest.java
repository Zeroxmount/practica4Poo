/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardshark;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rojas
 */
public class BarajaTest {
    
    public BarajaTest() {
    }

    /**
     * Test of barajar method, of class Baraja.
     */
    @Test
    public void testBarajar() {
        System.out.println("barajar");
        Baraja instance = new Baraja();
        instance.barajar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of repartir method, of class Baraja.
     */
    @Test
    public void testRepartir() {
        System.out.println("repartir");
        int n = 0;
        Baraja instance = new Baraja();
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.repartir(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darCarta method, of class Baraja.
     */
    @Test
    public void testDarCarta() {
        System.out.println("darCarta");
        Baraja instance = new Baraja();
        Carta expResult = null;
        Carta result = instance.darCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of juntarMazo method, of class Baraja.
     */
    @Test
    public void testJuntarMazo() {
        System.out.println("juntarMazo");
        Baraja mazoAuxiliar = null;
        Baraja instance = new Baraja();
        instance.juntarMazo(mazoAuxiliar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Baraja.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Baraja instance = new Baraja();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
