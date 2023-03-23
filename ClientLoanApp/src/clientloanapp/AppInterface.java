/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientloanapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class AppInterface extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        HBox rootBox = new HBox(10);
        rootBox.setAlignment(Pos.CENTER);
        
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        
        VBox leftBox = new VBox(10);
        leftBox.setAlignment(Pos.CENTER);
        
        Label label1 = new Label("Label 1");
        
        Label label2 = new Label("Label 2");
        
        buttonBox.getChildren().addAll(button1, button2);
        
        leftBox.getChildren().addAll(label1, buttonBox);
        
        rootBox.getChildren().addAll(leftBox, label2);
        
        Scene scene = new Scene(rootBox, 1024, 768);
        
        stage.setScene(scene);
        
        stage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
