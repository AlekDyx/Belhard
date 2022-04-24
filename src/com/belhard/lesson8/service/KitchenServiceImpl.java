package com.belhard.lesson8.service;

import com.belhard.lesson8.base.Animal;

public class KitchenServiceImpl implements KitchenService {


    @Override
    public void feed(Animal animal) {
        animal.eat();
    }

    @Override
    public void cook(String name, int amount) {
        System.out.println("Готовим блюдо из " + name + " и оно обойдется вам в " + amount + " $.");
    }
}
