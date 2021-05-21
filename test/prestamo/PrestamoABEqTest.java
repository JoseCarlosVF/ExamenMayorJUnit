/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PrestamoABEqTest {
    private static Prestamo instance;
    
    public PrestamoABEqTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Prestamo(); //Instanciamos nuestra clase
    }
    
    @After
    public void tearDown() {
        instance = null; //Anulamos el objeto para evitar posibles errores arrastrados
    }

    @Test
    public void testEstudioCaso1() {
        System.out.println("estudio");
        int cantidad = 0;
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEstudioCso3() {
        System.out.println("estudio");
        int cantidad = 9580;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEstudioCaso5() {
        System.out.println("estudio");
        int cantidad = 20000;
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
