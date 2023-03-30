package com.mycompany.clientloanappjfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        HBox rootBox = new HBox(100);
        rootBox.setAlignment(Pos.CENTER);
        
        TextField clientSearch = new TextField();
        clientSearch.setMaxWidth(200);
        
        Button searchButton = new Button("Search");
        
        rootBox.getChildren().addAll(clientSearch, searchButton);
        Scene scene = new Scene(rootBox, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}