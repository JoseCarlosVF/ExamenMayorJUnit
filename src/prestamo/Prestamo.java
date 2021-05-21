/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
}


/*
RESPONDER AQUI EL PUNTO 1 DEL EXÁMEN.

Caso1: realizaremos una prueba de equivalencia introduciendo un valor menor de 10000 (por ejemplo 0). Deberá mostrar el mensaje:"Préstamo no concedido carece de interes".
Caso2: será un prueba de voler límite en el que el valor será 1000. Mensaje de respuesta: "Felicidades, préstamo concedido"
Caso3: prueba de equivalencia con un valor entre 1000 y 15000 (por ejemplo: 9589). respues del programa: "Felicidades, préstamo concedido".
Caso4: prueba de valor límite, intoduciendo el valor 15000. respuesta: "Felicidades, préstamo concedido"
Caso5: valor de equivalencia con un valor mayor de 15000. Por ejemplo 20000. Mensaje: "Préstamo no concedido es una operación con demasiado riesgo". 
*/