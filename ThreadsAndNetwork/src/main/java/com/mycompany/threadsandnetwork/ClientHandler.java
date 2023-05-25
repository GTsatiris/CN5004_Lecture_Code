/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadsandnetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class ClientHandler implements Runnable{

    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    
    @Override
    public void run() {
        PrintWriter outPut = null;
        try {
            //send data to socket
            outPut = new PrintWriter(this.clientSocket.getOutputStream());
            
            //Spawn a receiving thread
            IncomingMsgHandler msgHandler = new IncomingMsgHandler(this.clientSocket);
            new Thread(msgHandler).start();
            
            Scanner scan = new Scanner(System.in);
            String lineMessage = "";
            while(!lineMessage.equalsIgnoreCase("exit"))
            {
                lineMessage = scan.nextLine();
                
                outPut.println(lineMessage);
                outPut.flush();
            }
            scan.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            outPut.close();
        }
    }
    
}
