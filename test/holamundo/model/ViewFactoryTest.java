/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.View;
import holamundo.view.UIJavaSwingImplementation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {
    
    /**
     *
     */
    public ViewFactoryTest() {
    }

    /**
     *
     */
    @Test
    public void tesViewFactory() throws Exception {
        ViewFactory view = new ViewFactory();
        View viewTest = view.getView();
        assertNotNull(viewTest);
        assertTrue(viewTest instanceof UIJavaSwingImplementation);
    }
    
}
