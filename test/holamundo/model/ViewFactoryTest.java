/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.View;
import holamundo.view.UIJavaFXImplementation;
import holamundo.view.UIJavaSwingImplementation;
import holamundo.view.UITextImplementation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {


    /**
     *
     * @throws java.lang.Exception
     */
    @Test
    public void tesViewFactoryJavaSwing() throws Exception {
        //Create object for testing
        ViewFactory view = new ViewFactory();
        //Call getView method
        View viewTest = view.getView();
        assertNotNull(viewTest);
        assertTrue(viewTest instanceof UIJavaSwingImplementation);
    }
     @Test
    public void tesViewFactoryJavaFX() throws Exception {
        //Create object for testing
        ViewFactory view = new ViewFactory();
        //Call getView method
        View viewTest = view.getView();
        assertNotNull(viewTest);
        assertTrue(viewTest instanceof UIJavaFXImplementation);
    }
     @Test
    public void tesViewFactoryText() throws Exception {
        //Create object for testing
        ViewFactory view = new ViewFactory();
        //Call getView method
        View viewTest = view.getView();
        assertNotNull(viewTest);
        assertTrue(viewTest instanceof UITextImplementation);
    }
    
}
