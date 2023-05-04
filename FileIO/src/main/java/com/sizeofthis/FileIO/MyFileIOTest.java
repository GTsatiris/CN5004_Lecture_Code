package com.sizeofthis.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileIOTest {

    public static void main(String[] args) {
        //TextFileExample();
        BinaryFileExample();
    }

    public static void TextFileExample ()
    {
        ArrayList<Client> myClients = TextIOHandler.readClientsFromFile("data/save/clients.txt");

        /*
            * for(int i = 0; i < myClients.size(); i++) { System.out.println("Client " +
            * i); System.out.println("- Name: " + myClients.get(i).getName());
            * System.out.println("- Address: " + myClients.get(i).getAddress());
            * System.out.println("- Monthly Income: " +
            * myClients.get(i).getMonthly_income());
            * System.out.println("------------------"); }
         */
        int i = 1;
        for (Client cl : myClients) {
            System.out.println("Client " + i);
            System.out.println("- Name: " + cl.getName());
            System.out.println("- Address: " + cl.getAddress());
            System.out.println("- Monthly Income: " + cl.getMonthly_income());
            System.out.println("------------------");
            i++;
        }

        //TODO DO THINGS WITH LIST OF CLIENTS!!
        TextIOHandler.storeClientsInFile(myClients, "data/save/clients.txt");
    }
    
    public static void CreateAndStoreToBinary() {
        ArrayList<Client> clientList = new ArrayList<Client>();
        
        for(int i = 0; i < 3; i++)
        {
            String name = TextIOHandler.handleConsoleInput();
            String address = TextIOHandler.handleConsoleInput();
            String income = TextIOHandler.handleConsoleInput();
            
            Client temp = new Client(name, address, income);
            clientList.add(temp);
        }
        
        BinaryIOHandler.storeClientsInFile(clientList, "data/save/clients.bin");
    }
    
    public static void BinaryFileExample()
    {
        ArrayList<Client> clientList = BinaryIOHandler.readClientsFromFile("data/save/clients.bin");
        
        int i = 1;
        for (Client cl : clientList) {
            System.out.println("Client " + i);
            System.out.println("- Name: " + cl.getName());
            System.out.println("- Address: " + cl.getAddress());
            System.out.println("- Monthly Income: " + cl.getMonthly_income());
            System.out.println("------------------");
            i++;
        }
        
        //TODO change clients in list
        
        BinaryIOHandler.storeClientsInFile(clientList, "data/save/clients.bin");
    }
}
