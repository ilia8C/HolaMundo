/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.controller;
/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class Controller {
    /**
     * Como datos de entrada del método tenemos el modelo y la vista instanciados,
     * el método run consigue el saludo del modelo de datos y lo manda a la vista.
     * @param view
     * @param model 
     */
    public void run(View view, Model model){
        
        String saludo = model.getGreeting();
        view.showGreeting(saludo);
            
        
    }
}
