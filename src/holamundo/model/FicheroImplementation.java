/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.Model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class FicheroImplementation implements Model{

    private ResourceBundle greetingFile;
    private String saludo = null;
    
    @Override
    public String getGreeting() {
        greetingFile = ResourceBundle.getBundle("greetingFile.properties");
        saludo = greetingFile.getString("myGreeting");
        return saludo;       
    }
    
}
