/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientloanapp;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author student
 */
public class ClientLoanApp {
	
	static ArrayList<Client> ALL_CLIENTS;
	
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        
//    	//Read all clients from DB
//    	try {
//        	ALL_CLIENTS = DataHandler.getClientsFromService();
//    	}
//    	catch(Exception e) {
//    		System.out.println("ERROR WHEN GETTING DATA: " + e.getMessage());
//    		System.out.println("Please try again ...");
//    		return;
//    	}
//    	
//    	//Search for and get a Client named "George"
//    	Client queryResult = DataHandler.GetClient(ALL_CLIENTS, "George");
//    	if(queryResult == null)
//    	{
//    		System.out.println("Client not found!! Please try again...");
//    		return;
//    	}
//    	
//    	float score = Client.riskAssessment(queryResult);
//    	System.out.println("Client's credit score is: " + score);
//    	if(score > 0.7)
//    		System.out.println("SUGGESTION: Client is eligible for a loan!");
//    	else
//    		System.out.println("SUGGESTION: Client is NOT eligible for a loan!");
//    }
}
