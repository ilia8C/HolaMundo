/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo.view;

import holamundo.controller.View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class UIJavaFXImplementation extends Application implements View{
    private static String saludo = "";
    
    @Override
    public void start(Stage stage) {
        Label lb = new Label(saludo);
        Pane root = new Pane();
        root.getChildren().add(lb);


        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Ventana JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void showGreeting(String greeting) {
        saludo = greeting;
        launch(new String[1]);
        
    } 
}
