package com.belhard.lesson4.model;

import com.belhard.lesson4.base.BasePhone;

public class SmartPhone extends BasePhone {

    private String operationSystem;

    public SmartPhone(String companyName, String model, String operationSystem) {
        super(companyName, model);
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return super.toString() + " operationSystem: " + operationSystem;
    }

    @Override
    public void call() {
        System.out.println("SmartPhone звонит");
    }

    @Override
    public void ring() {
        System.out.println("SmartPhone принимает");
    }
}
