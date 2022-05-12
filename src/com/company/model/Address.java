package com.company.model;

public class Address {
    private String city;
    private String street;
    private int homeNumber;
    private int appNumber;

    public Address(String city, String street, int homeNumber, int appNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.appNumber = appNumber;
    }

    public String displayInfo() {
        return "г." + city + ", ул. " + street + ", дом " + homeNumber + ", квартира " + appNumber;
    }

    public String getCity() {
        return city;
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

    public void setCity(String city) {
        this.city = city;
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
