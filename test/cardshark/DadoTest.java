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
public class DadoTest {
    
    public DadoTest() {
    }

    /**
     * Test of tirarDado method, of class Dado.
     */
    @Test
    public void testTirarDado() {
        System.out.println("tirarDado");
        int expResult = 0;
        int result = Dado.tirarDado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
