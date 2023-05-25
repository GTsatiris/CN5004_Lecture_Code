/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadsandnetwork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author student
 */
public class Server {
    public static void main(String[] args)
    {
        ServerSocket server = null;
        try {
            server = new ServerSocket(1234);
            while(true)
            {
                Socket client = server.accept();
                
                System.out.println("NEW CLIENT CONNECTION!");
                System.out.println(client.getInetAddress());
                System.out.println(client.getPort());
                
                ClientHandler clHandler = new ClientHandler(client);

                new Thread(clHandler).start();
            }
            
        } catch (IOException ex) {
            
        } finally {
            if(server != null)
            {
                try {
                    server.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else
            {
                //Type something...
            }
        }
    }
}
