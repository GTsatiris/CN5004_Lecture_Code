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
public class Client {
    
    private String firstName;
    private String lastName;
    private LocalDateTime clientSince;

    public Client() {
        firstName = "";
        lastName = "";
        clientSince = LocalDateTime.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getClientSince() {
        return clientSince;
    }

    public void setClientSince(LocalDateTime clientSince) {
        this.clientSince = clientSince;
    }
}
