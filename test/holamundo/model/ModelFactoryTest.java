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


    /**
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testModelFactoryDB() throws Exception {
        //Create object for testing
        ModelFactory model = new ModelFactory();
        //Call getModel method
        Model modelTest = model.getModel();
        //Assert tahat greeting in what is supposed to be
        assertNotNull(modelTest);
        assertTrue(modelTest instanceof DBImplementation);
    }
    
      @Test
    public void testModelFactoryFichero() throws Exception {
        //Create object for testing
        ModelFactory model = new ModelFactory();
        //Call getModel method
        Model modelTest = model.getModel();
        //Assert tahat greeting in what is supposed to be
        assertNotNull(modelTest);
        assertTrue(modelTest instanceof FicheroImplementation);
    }
}
