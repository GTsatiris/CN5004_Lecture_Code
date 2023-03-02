/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstapp;

import java.time.LocalDateTime;

/**
 *
 * @author student
 */
public class Account {
    
    private double balance;
    private Client owner;
    private LocalDateTime lastTransaction;

    public Account() {
        balance = 0;
        owner = new Client();
        lastTransaction = LocalDateTime.now();
    }
    
    public void addFunds(double fundsToAdd)
    {
        balance = balance + fundsToAdd;
        lastTransaction = LocalDateTime.now();
    }
    
    public double withdrawFunds(double fundsToWithdraw)
    {
        balance = balance - fundsToWithdraw;
        lastTransaction = LocalDateTime.now();
        return balance;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public LocalDateTime getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(LocalDateTime lastTransaction) {
        this.lastTransaction = lastTransaction;
    }
}
