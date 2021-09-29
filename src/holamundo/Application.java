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
     * Main method that executes the application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declaration and initialization of model and view factories
         */
        ModelFactory modelFactory = new ModelFactory();
        ViewFactory viewFactory = new ViewFactory();

        /**
         * Call the getModel method of the model factory and store it in a
         * variable of type Model. Call to the getView method of the view
         * factory and store it in a variable of type View.
         */
        Model model = modelFactory.getModel();
        View view = viewFactory.getView();

        /**
         * Declaration and initialization of the controller class. Call to the
         * run method of the controller with input parameters view and model.
         */
        Controller controller = new Controller();
        controller.run(view, model);
    }

}
