/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientloanappjfx;

import java.util.Random;

/**
 *
 * @author student
 */
public class Client {
    protected String name;
    private String address;
    private float annualIncome;
    private boolean hasDefaultedBefore;

    public Client() {
        Random rand = new Random();
        this.name = "Client" + rand.nextInt();
        this.address = "Adderss" + rand.nextInt();
        this.annualIncome = rand.nextFloat();
        this.hasDefaultedBefore = rand.nextBoolean();
    }

    public Client(String name, String address, float annualIncome, boolean hasDefaultedBefore) {
        this.name = name;
        this.address = address;
        this.annualIncome = annualIncome;
        this.hasDefaultedBefore = hasDefaultedBefore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(float annualIncome) {
        this.annualIncome = annualIncome;
    }

    public boolean isHasDefaultedBefore() {
        return hasDefaultedBefore;
    }

    public void setHasDefaultedBefore(boolean hasDefaultedBefore) {
        this.hasDefaultedBefore = hasDefaultedBefore;
    }
    
    public float getClientScore()
    {
        //TODO calculate score based on income and hasDefaulted
        float score = 0.5f;
        
        if(this.hasDefaultedBefore)
            score = score * 0.01f;
        else
            score = score + 0.0001f * this.annualIncome;
        
        return score;
    }
    
    //Utility method provided by the Client class
    public static float riskAssessment(Client client) {
        float initialScore = client.getClientScore();
        
        //Machine Learning MOCK
        Random rand = new Random();
        float finalScore = rand.nextFloat() + initialScore;
        
        if(finalScore > 1.0f)
        	finalScore = 1.0f;
        
        if(finalScore < 0.0f)
        	finalScore = 0.0f;
        
        return finalScore;
    }

}
