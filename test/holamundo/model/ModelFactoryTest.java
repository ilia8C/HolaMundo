/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.Model;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }

    @Test
    public void testSomeMethod() {
        /* //Create object for testing
        FicheroImplementation fichero = new FicheroImplementation();
        //Call getGreeting method
        String saludo = fichero.getGreeting();
        //Assert tahat greeting in what is supposed to be
        assertEquals(saludo, "Hola mundo");*/
        ModelFactory model = new ModelFactory();
        Model modelTest = model.getModel();
        assertNotNull(modelTest);
       // assertTrue(modelTest instanceof BDImplementation);
    }
    
}
