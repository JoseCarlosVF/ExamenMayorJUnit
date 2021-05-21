/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author User
 */
@RunWith(value=Parameterized.class)
public class PrestamoParaTest {
    private int cantidad;
    private String respuesta;
    
    public PrestamoParaTest(int can, String res) {
        this.cantidad=can;
        this.respuesta=res;
    }
    
    @Parameters
    public static Iterable<Object> getData() {
        List<Object> pres = new ArrayList<>();
        
        pres.add(new Object[]{0,"Préstamo no concedido carece de interes"});
        pres.add(new Object[]{1000,"Felicidades, préstamo concedido"});
        pres.add(new Object[]{9580,"Felicidades, préstamo concedido"});
        pres.add(new Object[]{15000,"Felicidades, préstamo concedido"});
        pres.add(new Object[]{20000,"Préstamo no concedido es una operación con demasiado riesgo"});
        
        return pres;
    }
    
    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testEstudio() {
        System.out.println("estudio");
        //int cantidad = 0;
        Prestamo instance = new Prestamo();
        //String expResult = "";
        String result = instance.estudio(this.cantidad);
        assertEquals(this.respuesta, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
