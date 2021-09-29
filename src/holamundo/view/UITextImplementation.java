/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

import holamundo.controller.View;

/**
 * Class for console implementation
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class UITextImplementation implements View {

    /**
     * Method to display by console the received greeting
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
