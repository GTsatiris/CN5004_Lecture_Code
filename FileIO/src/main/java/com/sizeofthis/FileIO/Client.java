package com.sizeofthis.FileIO;

public class Client {

    private String name;
    private String address;
    private String monthly_income;

    public Client(String name, String address, String monthly_income) {
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

    public String getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(String monthly_income) {
        this.monthly_income = monthly_income;
    }
}
