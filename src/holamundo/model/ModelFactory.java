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
 * Class for the model factory
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class ModelFactory {

    /**
     * Method that returns the instantiated model by reading the configuration
     * file
     *
     * @return modelo
     */
    public Model getModel() {

        ResourceBundle modelFactory;
        String modelString;
        final String FICHERO = "FICHERO";
        final String DB = "DB";
        Model model;

        modelFactory = ResourceBundle.getBundle("holamundo.model.ConfigType", new Locale("es"));
        modelString = modelFactory.getString("modelo");
        switch (modelString) {
            case FICHERO:
                model = new FicheroImplementation();
                break;
            case DB:
                model = new DBImplementation();
                break;
            default:
                model = null;
                break;
        }

        return model;
    }
}
