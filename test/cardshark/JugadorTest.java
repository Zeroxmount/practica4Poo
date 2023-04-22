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
public class JugadorTest {
    
    public JugadorTest() {
    }

    /**
     * Test of lanzarDado method, of class Jugador.
     */
    @Test
    public void testLanzarDado() {
        System.out.println("lanzarDado");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.lanzarDado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jugarCarta method, of class Jugador.
     */
    @Test
    public void testJugarCarta() {
        System.out.println("jugarCarta");
        Jugador instance = new Jugador();
        Carta expResult = null;
        Carta result = instance.jugarCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarCarta method, of class Jugador.
     */
    @Test
    public void testQuitarCarta() {
        System.out.println("quitarCarta");
        int i = 0;
        Jugador instance = new Jugador();
        instance.quitarCarta(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntuacion method, of class Jugador.
     */
    @Test
    public void testGetPuntuacion() {
        System.out.println("getPuntuacion");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.getPuntuacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntuacion method, of class Jugador.
     */
    @Test
    public void testSetPuntuacion() {
        System.out.println("setPuntuacion");
        int puntuacion = 0;
        Jugador instance = new Jugador();
        instance.setPuntuacion(puntuacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMisCartas method, of class Jugador.
     */
    @Test
    public void testGetMisCartas() {
        System.out.println("getMisCartas");
        Jugador instance = new Jugador();
        ArrayList<Carta> expResult = null;
        ArrayList<Carta> result = instance.getMisCartas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tomarCartas method, of class Jugador.
     */
    @Test
    public void testTomarCartas() {
        System.out.println("tomarCartas");
        ArrayList<Carta> cartas = null;
        Jugador instance = new Jugador();
        instance.tomarCartas(cartas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCartas method, of class Jugador.
     */
    @Test
    public void testMostrarCartas() {
        System.out.println("mostrarCartas");
        Jugador instance = new Jugador();
        instance.mostrarCartas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumJugador method, of class Jugador.
     */
    @Test
    public void testGetNumJugador() {
        System.out.println("getNumJugador");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.getNumJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumJugador method, of class Jugador.
     */
    @Test
    public void testSetNumJugador() {
        System.out.println("setNumJugador");
        int num = 0;
        Jugador instance = new Jugador();
        instance.setNumJugador(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
