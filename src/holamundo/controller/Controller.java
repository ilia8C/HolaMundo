/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.controller;

import holamundo.model.FicheroImplementation;
import holamundo.view.UITextImplementation;

/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class Controller {
    Model model = new FicheroImplementation();
    String saludo = model.getGreeting();
    View text = new UITextImplementation(saludo);
}
