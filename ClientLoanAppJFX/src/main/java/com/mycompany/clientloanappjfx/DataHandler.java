package com.mycompany.clientloanappjfx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DataHandler { //Utility class for accessing client data from DB/service

    public static ArrayList<Client> getClientsFromService() throws Exception {//MOCK
            // TODO crazy REST API mumbo jumbo
            Random rand = new Random();

            float dice = rand.nextFloat();
            if(dice <= 0.1f)
            {
                    throw new Exception("Could not connect to Service/DB!!!");
            }

            ArrayList<Client> clients = new ArrayList<Client>();

            for (int i = 0; i < 100; i++) {
                    Client temp;
                    if (i % 2 == 0) {
                            temp = new IndivClient();
                    } else {
                            temp = new BusinessClient();
                    }

                    clients.add(temp);
            }

            Client temp = new IndivClient();
            temp.setName("George");
            clients.add(temp);

            return clients;
    }

    public static HashMap<String, Client> getClientsFromServiceAsMap() throws Exception {//MOCK
            // TODO crazy REST API mumbo jumbo
            Random rand = new Random();

            float dice = rand.nextFloat();
            if(dice <= 0.1f)
            {
                    throw new Exception("Could not connect to Service/DB!!!");
            }

            HashMap<String, Client> clients = new HashMap<String, Client>();

            for (int i = 0; i < 100; i++) {
                    Client temp;
                    if (i % 2 == 0) {
                            temp = new IndivClient();
                    } else {
                            temp = new BusinessClient();
                    }

                    clients.put(temp.getName(), temp);
            }

            Client temp = new IndivClient();
            temp.setName("George");
            clients.put("George", temp);

            return clients;
    }

    public static Client GetClient(ArrayList<Client> clients, String clientName) {
            Client result = null;
            for (int i = 0; i < clients.size(); i++) {
                    if (clients.get(i).getName().equals(clientName))
                    {
                            result = clients.get(i);
                            return result;

                    }
            }

            return null;
    }

    public static Client GetClientFromMap(HashMap<String, Client> clients, String clientName) {
            Client result = null;

            if(clients.containsKey(clientName)) {
                    result = clients.get(clientName);
            }
            else
                    result = null;

            return result;
    }
}
