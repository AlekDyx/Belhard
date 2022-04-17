package com.belhard.lesson4.base;

public abstract class BasePhone {
    private String companyName;
    private String model;

    public String getCompanyName() {
        return companyName;
    }

    public String getModel() {
        return model;
    }

    public BasePhone(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }

    public abstract void call();

    public abstract void ring();

    @Override
    public String toString() {
        return "companyName: " + companyName + " model: " + model;
    }
}
