/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadsandnetwork;

import java.util.Random;

/**
 *
 * @author student
 */
public class ChatServer extends Thread {
    public int counter;
    public boolean shouldStop;
    
    public ChatServer()
    {
        this.counter = 0;
        this.shouldStop = false;
    }
    
    @Override
    public synchronized void run()
    {
        while(!shouldStop)
        {
            System.out.println(this.counter);
            counter++;
            Random rand = new Random();
            try {
                this.wait((long)(1000 * rand.nextDouble()));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
