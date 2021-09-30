/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.model;

import holamundo.controller.View;
import holamundo.view.UIJavaFXImplementation;
import holamundo.view.UIJavaSwingImplementation;
import holamundo.view.UITextImplementation;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Class for the view factory
 *
 * @author 2dam
 */
public class ViewFactory {

    /**
     * Method that returns the instantiated view by reading the configuration
     * file
     *
     * @return vista
     */
    public View getView() throws Exception{

        ResourceBundle viewFactory;
        String viewString;
        final String UITEXT = "UITEXT";
        final String UIJAVASWING = "UIJAVASWING";
        final String UIJAVAFX = "UIJAVAFX";
        View view = null;
        viewFactory = ResourceBundle.getBundle("holamundo.model.ConfigType", new Locale("es"));
        viewString = viewFactory.getString("vista");

        switch (viewString) {
            case UITEXT:
                view = new UITextImplementation();
                break;
            case UIJAVASWING:
                view = new UIJavaSwingImplementation();
                break;
            case UIJAVAFX:
                view = new UIJavaFXImplementation();
                break;
            default:
                break;
        }
        return view;
    }

}
