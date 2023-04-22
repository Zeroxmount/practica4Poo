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
public class CardSharkTest {
    
    public CardSharkTest() {
    }

    /**
     * Test of main method, of class CardShark.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CardShark.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of repartirCartas method, of class CardShark.
     */
    @Test
    public void testRepartirCartas() {
        System.out.println("repartirCartas");
        int cantJugadores = 0;
        CardShark instance = new CardShark();
        instance.repartirCartas(cantJugadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jugarRonda method, of class CardShark.
     */
    @Test
    public void testJugarRonda() {
        System.out.println("jugarRonda");
        CardShark instance = new CardShark();
        instance.jugarRonda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
