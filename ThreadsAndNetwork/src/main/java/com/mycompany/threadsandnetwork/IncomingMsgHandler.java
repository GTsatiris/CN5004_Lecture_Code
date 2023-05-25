/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadsandnetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author student
 */
public class IncomingMsgHandler implements Runnable{

    private Socket socket;
    private BufferedReader reader;

    public IncomingMsgHandler(Socket socket) {
        this.socket = socket;
        
        //read data from socket
        InputStreamReader in = null;
        try {
            in = new InputStreamReader(socket.getInputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        this.reader = new BufferedReader(in);
    }
    
    @Override
    public void run() {
        String reply = "";
        
        while(!reply.equalsIgnoreCase("exit"))
        {
            try {
                reply = this.reader.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            String hostAddress = this.socket.getInetAddress().getHostAddress();
            System.out.println(hostAddress + ": " + reply);
        }
    }
    
}
