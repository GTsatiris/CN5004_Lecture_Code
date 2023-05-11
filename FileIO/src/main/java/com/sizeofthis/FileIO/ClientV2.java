package com.sizeofthis.FileIO;

import java.io.Serializable;

public class ClientV2 implements Serializable {

    private String name;
    private String address;
    private double monthly_income;

    public ClientV2(String name, String address, double monthly_income) {
        this.name = name;
        this.address = address;
        this.monthly_income = monthly_income;
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

    public double getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(double monthly_income) {
        this.monthly_income = monthly_income;
    }
}
