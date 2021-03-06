/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class DBImplementationTest {

    /**
    * Método para testear el método getGreeting de la implementación de la base de datos
     * @throws java.lang.Exception
    */
    @Test
    public void tesGetGreeting() throws Exception {
        //Create object for testing
        DBImplementation db = new DBImplementation();
        //Call getGreeting method
        String saludo = db.getGreeting();
        //Assert that greeting is what is supposed to be
        assertEquals(saludo, "Hola mundo");
    }
    
}
