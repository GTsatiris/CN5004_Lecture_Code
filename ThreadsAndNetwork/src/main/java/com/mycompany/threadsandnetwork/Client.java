/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadsandnetwork;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Client {
    
    public static void main(String[] args)
    {
        try(Socket socket = new Socket("localhost", 1234))
        {
            //send data to socket
            PrintWriter outPut = new PrintWriter(socket.getOutputStream());
            Scanner scan = new Scanner(System.in);
            
            //Spawn a receiving thread
            IncomingMsgHandler msgHandler = new IncomingMsgHandler(socket);
            new Thread(msgHandler).start();
            
            String lineMessage = "";

            while(!lineMessage.equalsIgnoreCase("exit"))
            {
                lineMessage = scan.nextLine();
                
                outPut.println(lineMessage);
                outPut.flush();
            }
            
            scan.close();

        } catch (UnknownHostException e)
        {
            //TODO
        } catch (IOException e)
        {
            //TODO
        }
    }

}
