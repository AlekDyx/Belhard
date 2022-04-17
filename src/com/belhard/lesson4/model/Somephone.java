package com.belhard.lesson4.model;

import com.belhard.lesson4.base.BasePhone;

public class Somephone extends BasePhone {

    private boolean checkBluethooth;

    public Somephone(String companyName, String model, boolean checkBluethooth) {
        super(companyName, model);
        this.checkBluethooth = checkBluethooth;
    }

    @Override
    public String toString() {
        return super.toString() + " checkBluethooth: " + checkBluethooth;
    }

    @Override
    public void call() {
        System.out.println("SomePhone набирает");
    }

    @Override
    public void ring() {
        System.out.println("SomePhone принимает");
    }
}
