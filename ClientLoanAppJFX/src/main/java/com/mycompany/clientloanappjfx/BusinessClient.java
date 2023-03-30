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
public class BusinessClient extends Client{
    
    private String companyName;
    private float netIncome;
    
    public BusinessClient() {
        super();
        Random rand = new Random();
        this.companyName = "CN" + rand.nextInt();
        this.netIncome = rand.nextFloat();
    }

    public BusinessClient(String companyName, float netIncome, String name, String address, float annualIncome, boolean hasDefaultedBefore) {
        super(name, address, annualIncome, hasDefaultedBefore);
        this.companyName = companyName;
        this.netIncome = netIncome;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }
    
    @Override
    public float getClientScore() //hides parent class getClientScore functionality
    {
        return 100;
    }
}
