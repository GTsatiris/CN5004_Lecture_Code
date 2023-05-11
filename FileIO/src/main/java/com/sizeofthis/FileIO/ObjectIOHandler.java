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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ObjectIOHandler {

    public static ArrayList<ClientV2> readClientsFromFileV2(String filePath) {
        ArrayList<ClientV2> myClients = new ArrayList<ClientV2>();
        
        try (
                FileInputStream clientFile = new FileInputStream(filePath);
                ObjectInputStream clientStream = new ObjectInputStream(clientFile);
            )
        {
            boolean endOfFile = false;
            while(!endOfFile)
            {
                try
                {
                    ClientV2 newClient = (ClientV2)clientStream.readObject();
                    myClients.add(newClient);
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                } catch (ClassNotFoundException ex) {
                    System.out.println("ERROR: Unable to unpack ClientV2 object!");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: Cannot find client file!");
        } catch (IOException e) {
            System.out.println("ERROR: There was a problem reading from file!");
        }
        
        return myClients;
    }

    public static void storeClientsInFileV2(ArrayList clientList, String filePath) {
        try(
            FileOutputStream clientFile = new FileOutputStream(filePath);
            ObjectOutputStream clientStream = new ObjectOutputStream(clientFile);    
            )
        {
            for(Object cl : clientList)
            {
                clientStream.writeObject(cl);
            }
        }
        catch(IOException e)
        {
            System.out.println("ERROR: There was a problem writing to file!");
        }
    }
}
