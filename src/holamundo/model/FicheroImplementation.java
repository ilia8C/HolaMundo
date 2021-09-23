/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.Model;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class FicheroImplementation implements Model{

    private ResourceBundle greetingFile;
    private String saludo = null;
    
    /**
     * 
     * @return saludo
     */
    @Override
    public String getGreeting() {
        greetingFile = ResourceBundle.getBundle("holamundo.model.greetingFile", new Locale("es"));
        saludo = greetingFile.getString("myGreeting");
        return saludo;       
    }
    
}
