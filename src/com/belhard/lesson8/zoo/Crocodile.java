package com.belhard.lesson8.zoo;

import com.belhard.lesson8.base.Animal;

public class Crocodile implements Animal {


    @Override
    public void eat() {
        System.out.println("Кроко кушает");
    }

    @Override
    public void sleep() {
        System.out.println("Кроко спит");

    }
}
