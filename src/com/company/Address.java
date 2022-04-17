package com.company;

public class Address {
    private String sity;
    private String street;
    private int homeNumber;
    private int appNumber;

    public Address(String sity, String street, int homeNumber, int appNumber) {
        this.sity = sity;
        this.street = street;
        this.homeNumber = homeNumber;
        this.appNumber = appNumber;
    }

    public String displayInfo() {
        return "г." + sity + ", ул. " + street + ", дом " + homeNumber + ", квартира " + appNumber;
    }

    public String getSity() {
        return sity;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public int getAppNumber() {
        return appNumber;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setAppNumber(int appNumber) {
        this.appNumber = appNumber;
    }
}
