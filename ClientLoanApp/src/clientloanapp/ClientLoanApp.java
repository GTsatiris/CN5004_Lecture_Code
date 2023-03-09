/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientloanapp;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class ClientLoanApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client George = new Client();
        IndivClient Skoulikaritis = new IndivClient(); 
        
        George.getAddress();
        Skoulikaritis.getAddress();
        
        riskAssessment(George);
        riskAssessment(Skoulikaritis);
        
        long a = 10;
        int b = (int)a;
    }
    
    public static float riskAssessment(Client client) {
        float initialScore = client.getClientScore();
        return 0.0f;
    }
    
    public static ArrayList<Client> getClientsFromService(){
        //TODO crazy REST API mumbo jumbo
        ArrayList<Client> clients = new ArrayList<Client>();
        
        for(int i = 0; i < 100; i++)
        {
            Client temp;
            if(i % 2 == 0)
            {
                temp = new IndivClient();
            }
            else
            {
                temp = new BusinessClient();
            }
            
            clients.add(temp);
        }
        
        return clients;
    }
            
    public static Client GetClient(ArrayList<Client> clients, String clientName) throws Exception
    {
        Client result = null;
        for(int i = 0; i < clients.size(); i++)
        {
            if(clients.get(i).getName().equals(clientName))
                result = clients.get(i);
        }
        
        if(result == null)
        {
            throw new Exception("Client not found");
        }
        
        return result;
    }
}
