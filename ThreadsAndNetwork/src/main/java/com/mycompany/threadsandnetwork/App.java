package com.mycompany.threadsandnetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();
        ChatServer dummy = new ChatServer();
        dummy.start();
        ChatServer dummy2 = new ChatServer();
        dummy2.start();
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String typedText;

        boolean stop = false;
        while(!stop)
        {
            try {
                typedText = reader.readLine();
                if(typedText.equals("stop"))
                    stop = true;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        dummy.shouldStop = true;
        dummy2.shouldStop = true;
    }

}