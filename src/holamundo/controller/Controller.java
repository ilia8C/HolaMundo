/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.controller;

/**
 * Class to connect the interfaces to the application
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class Controller {

    /**
     * As input data of the method we have the model and the view instantiated,
     * the run method gets the greeting from the data model and sends it to the
     * view.
     * @param view
     * @param model
     */
    public void run(View view, Model model) throws Exception {

        String saludo = model.getGreeting();
        view.showGreeting(saludo);

    }
}
