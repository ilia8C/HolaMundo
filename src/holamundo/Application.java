/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import holamundo.controller.Controller;
import holamundo.controller.Model;
import holamundo.controller.View;
import holamundo.model.ModelFactory;
import holamundo.model.ViewFactory;


/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class Application {

    /** 
     * Método main que ejecuta la aplicación
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaración e inicialización de las factorías del modelo y la vista
         */
        ModelFactory modelFactory = new ModelFactory();
        ViewFactory viewFactory = new ViewFactory();
        
        /**
         * Llamada al método getModel de la factoría de modelo y lo guardamos en
         * una variable de tipo Model
         * Llamada al método getView de la factoría de vista y lo guardamos en
         * una variable de tipo View
         */
        Model model = modelFactory.getModel();
        View view = viewFactory.getView();
        
        /**
         * Declaración e inicialización de la clase controlador
         * Llamada al método run del controlador con los parámetros de entrada 
         * view y model
         */
        Controller controller = new Controller();
        controller.run(view, model);
    }
   
    
}
