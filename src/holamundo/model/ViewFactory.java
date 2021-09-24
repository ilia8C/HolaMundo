/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.Model;
import holamundo.controller.View;
import holamundo.view.UIJavaSwingImplementation;
import holamundo.view.UITextImplementation;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {

    private ResourceBundle viewFactory;
    private String viewString;
    private final String UITEXT = "UITEXT";
    private final String UIJAVASWING = "UIJAVASWING";
    private final String UIJAVAFX = "UIJAVAFX";
    View view;
    
    public View getView() {
        
        viewFactory = ResourceBundle.getBundle("holamundo.model.ConfigType", new Locale("es"));
        viewString = viewFactory.getString("vista");
        
        switch(viewString){
            case UITEXT:
                view = new UITextImplementation();
                break;
            case UIJAVASWING:
                view = new UIJavaSwingImplementation();
                break;
            case UIJAVAFX:
                break;
            default:
                break;
        }
        return view;
    }
    
}
