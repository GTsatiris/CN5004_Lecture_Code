/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sizeofthis.FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class BinaryIOHandler {

    public static ArrayList<Client> readClientsFromFile(String filePath) {
        ArrayList<Client> myClients = new ArrayList<Client>();
        
        try (
                FileInputStream fileInput = new FileInputStream(filePath);
                DataInputStream fileStream = new DataInputStream(fileInput);
            )
        {
            boolean endOfFile = false;
            while(!endOfFile)
            {
                try
                {
                    String name = fileStream.readUTF();
                    String address = fileStream.readUTF();
                    String monthly_income = fileStream.readUTF();
                    myClients.add(new Client(name, address, monthly_income));
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Cannot find client file!");
        } catch (IOException e) {
            System.out.println("ERROR: There was a problem reading from file!");
        }
        
        return myClients;
    }

    public static void storeClientsInFile(ArrayList<Client> clientList, String filePath) {
        try (
                FileOutputStream fileOutput = new FileOutputStream(filePath);
                DataOutputStream fileWriter = new DataOutputStream(fileOutput);
            ) 
        {
            for(Client cl : clientList)
            {
                fileWriter.writeUTF(cl.getName());
                fileWriter.writeUTF(cl.getAddress());
                fileWriter.writeUTF(cl.getMonthly_income());
            }
        } catch (IOException e) {
            System.out.println("ERROR: There was a problem writing to file!");
        }
    }
}
