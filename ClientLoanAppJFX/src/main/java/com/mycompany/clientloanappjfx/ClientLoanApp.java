/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.clientloanappjfx;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author student
 */
public class ClientLoanApp {
    
    static ArrayList<Client> ALL_CLIENTS;
    
    public static void InitApplication()
    {
        try {
            ALL_CLIENTS = DataHandler.getClientsFromService();
    	}
    	catch(Exception e) {
            System.out.println("ERROR WHEN GETTING DATA: " + e.getMessage());
            System.out.println("Please try again ...");
            return;
    	}
    }
    
    public static Client getClient(String clientName) throws Exception
    {
        if(ALL_CLIENTS != null)
        {
            Client queryResult = DataHandler.GetClient(ALL_CLIENTS, clientName);
            if(queryResult == null)
            {
                    throw new Exception("Client not found!!\nPlease try again...");
            }
            return queryResult;
        }
        else
        {
            throw new Exception("Could not retrieve client list!!\nPlease try again...");
        }
    }
    
    public static boolean giveLoan(Client client, float threshold)
    {
        float score = Client.riskAssessment(client);
    	System.out.println("Client's credit score is: " + score);
//    	if(score > threshold)
//            return true;
//    	else
//            return false;
        return score > threshold;
    }
}
