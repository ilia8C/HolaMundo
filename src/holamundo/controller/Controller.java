/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.controller;

import holamundo.model.FicheroImplementation;
import holamundo.view.UITextImplementation;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class Controller {
    /**
     * 
     * @param view
     * @param model 
     */
    public void run(View view, Model model){
        
            String saludo = model.getGreeting();
            view.showGreeting(saludo);
            
        
    }
}
