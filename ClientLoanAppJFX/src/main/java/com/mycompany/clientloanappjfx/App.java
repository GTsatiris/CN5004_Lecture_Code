package com.mycompany.clientloanappjfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


/**
 * JavaFX App
 */
public class App extends Application {
    Client result;
    
    @Override
    public void start(Stage stage) {
        Label infoLabel1 = new Label("Client search");
        infoLabel1.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        
        HBox searchBox = new HBox(50);
        searchBox.setAlignment(Pos.CENTER);
        
        TextField clientSearch = new TextField();
        clientSearch.setText("Search client...");
        clientSearch.setMaxWidth(200);
        
        Button searchButton = new Button("Search");
              
        searchBox.getChildren().addAll(clientSearch, searchButton);
        
        TextArea infoSpace = new TextArea();
        infoSpace.setEditable(false);
        infoSpace.setMinSize(200, 100);
        infoSpace.setMaxSize(200, 100);
        
        Button eligibilityCheck = new Button("Check eligibility");
        eligibilityCheck.setVisible(false);
        
        Label verdictLabel = new Label("PLACEHOLDER");
        verdictLabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        verdictLabel.setVisible(false);
        
        searchButton.setOnAction(eh ->
        {
            //The code that runs when we click the button
            if(clientSearch.getText().isBlank() ||
                    clientSearch.getText().equals("Search client..."))
            {
                infoSpace.setText("Please type a valid client name!");
                eligibilityCheck.setVisible(false);
                verdictLabel.setVisible(false);
            }
            else
            {
                String nameToSearch = clientSearch.getText();
                try {
                    result = ClientLoanApp.getClient(nameToSearch);
                    infoSpace.setText("Client name: " + result.getName() +
                            "\nClient address: " + result.getAddress());
                    eligibilityCheck.setVisible(true);
                    verdictLabel.setVisible(false);
                }
                catch(Exception e){
                    infoSpace.setText(e.getMessage());
                    eligibilityCheck.setVisible(false);
                    verdictLabel.setVisible(false);
                }
            }
        });
        
        eligibilityCheck.setOnAction(eh ->
        {
            boolean eligibleForLoan = ClientLoanApp.giveLoan(result, 0.7f);
            if(eligibleForLoan)
            {
                verdictLabel.setText("Client eligible for loan!");
                verdictLabel.setTextFill(Color.GREEN);
                verdictLabel.setVisible(true);
            }
            else
            {
                verdictLabel.setText("Client NOT eligible for loan!!");
                verdictLabel.setTextFill(Color.RED);
                verdictLabel.setVisible(true);
            }
        });
        
        VBox rootBox = new VBox(20);
        rootBox.setAlignment(Pos.CENTER);
        rootBox.getChildren().addAll(infoLabel1, searchBox, infoSpace, eligibilityCheck, verdictLabel);
        
        Scene scene = new Scene(rootBox, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        ClientLoanApp.InitApplication();
        launch();
    }

}