/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

import holamundo.controller.View;

/**
 *
 * @author 2dam
 */
public class UITextImplementation implements View{

    @Override
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
    
}
