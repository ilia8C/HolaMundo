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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelFactory modelFactory = new ModelFactory();
        ViewFactory viewFactory = new ViewFactory();
        // TODO code application logic here
        /**
         * 
         */
        Model model = modelFactory.getModel();
        View view = viewFactory.getView();
        Controller controller = new Controller();
        controller.run(view, model);
    }
   
    
}
