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
 * Class for reading the file
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class FicheroImplementation implements Model {

    /**
     * Method to read the file with the greeting and return the greeting in a
     * String variable.
     *
     * @return saludo
     */
    @Override
    public String getGreeting() throws Exception{

        ResourceBundle greetingFile;
        String saludo = null;
        greetingFile = ResourceBundle.getBundle("holamundo.model.greetingFile", new Locale("es"));
        saludo = greetingFile.getString("myGreeting");
        return saludo;
    }

}
