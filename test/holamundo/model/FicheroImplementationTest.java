/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class FicheroImplementationTest {
   /**
    * Método para testear el método getGreeting de la implementación del fichero
    */
    @Test
    public void testGetGreeting() {
        //Create object for testing
        FicheroImplementation fichero = new FicheroImplementation();
        //Call getGreeting method
        String saludo = fichero.getGreeting();
        //Assert tahat greeting in what is supposed to be
        assertEquals(saludo, "Hola mundo");
    }
    
    
    
}
