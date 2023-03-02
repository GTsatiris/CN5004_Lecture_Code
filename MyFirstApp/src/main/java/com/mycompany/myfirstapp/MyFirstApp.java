/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfirstapp;

/**
 *
 * @author student
 */
public class MyFirstApp {

    public static void main(String[] args) {
        Account tsatirisAccount = new Account();
        Client tsatiris = new Client();
                
        tsatirisAccount.setOwner(tsatiris);
        
        //tsatirisAccount.getOwner().toString();
        
        tsatirisAccount.addFunds(100);
        tsatirisAccount.setBalance(2314);
        //System.out.println(myAccount);
    }
}
