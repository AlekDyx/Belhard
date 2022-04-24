package com.belhard.lesson8.zoo;

import com.belhard.lesson8.base.Mammals;
import com.belhard.lesson8.service.KitchenService;

public class Cat extends Mammals {


    public Cat(String view, int age, String name) {
        super(view, age, name);
    }

    @Override
    public void eat() {
        System.out.println("Кот жратеньки");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спу-спу");
    }
}
