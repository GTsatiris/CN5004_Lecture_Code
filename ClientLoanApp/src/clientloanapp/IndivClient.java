/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientloanapp;

import java.util.Random;

/**
 *
 * @author student
 */
public class IndivClient extends Client {
    
    private boolean isEmployed;
    private float otherIncomes;

    public IndivClient() {
        super();
        Random rand = new Random();
        this.isEmployed = rand.nextBoolean();
        this.otherIncomes = rand.nextFloat();
    }

    public IndivClient(boolean isEmployed, float otherIncomes, String name, String address, float annualIncome, boolean hasDefaultedBefore) {
        super(name, address, annualIncome, hasDefaultedBefore);
        this.isEmployed = isEmployed;
        this.otherIncomes = otherIncomes;
    }

    public boolean isIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public float getOtherIncomes() {
        return otherIncomes;
    }

    public void setOtherIncomes(float otherIncomes) {
        this.otherIncomes = otherIncomes;
    }
    
    @Override
    public float getClientScore() { //calls super.getClientScore, effectively EXTENDING its functionality
        float score = super.getClientScore();
        
        if(this.isEmployed)
        {
            score += 0.1;
        }
        score = score + 0.0001f * this.otherIncomes;
        
        return score;
    }
}
