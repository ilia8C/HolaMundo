/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

import holamundo.controller.View;

/**
 *
 * @author Ilia Consuegra y Alain Lozano
 */
public class UITextImplementation implements View{
  
    /**
     * 
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
    
}
