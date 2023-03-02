/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfirstapp;

import java.time.LocalDateTime;

/**
 *
 * @author student
 */
public class MyFirstApp {

    public static void main(String[] args) {
//        Account tsatirisAccount = new Account();
        Client tsatiris = new Client();
//                
//        Account skoulikaritisAccount =
//                new Account(100, new Client(), LocalDateTime.now());
//        
//        //tsatirisAccount.setOwner(tsatiris);
//        
//        tsatirisAccount.getOwner().toString();
//        
//        tsatirisAccount.addFunds(100);
//        tsatirisAccount.setBalance(2314);
//        //System.out.println(myAccount);
//        
//        System.out.println("Hello there");
//        System.out.println(10);
        
        int a = 50;
        ByValueTest(a);
        //System.out.println("a outside: " + a);
        
        Client b = new Client("George", "Tsatiris");
        //System.out.println("b name outside 1: " + b.getFirstName());
        ByReferenceTest(b);
        //System.out.println("b name outside 2: " + b.getFirstName());
        
        Client c = b;
        
        System.out.println(tsatiris.equals(b));
    }
    
    public static void ByValueTest(int a) {
        a++;
        System.out.println("a inside: " + a);
    }
    
    public static void ByReferenceTest(Client b) {
        b.setFirstName("SKOULIKARITIS");
        System.out.println("b name inside: " + b.getFirstName());
    }
}
