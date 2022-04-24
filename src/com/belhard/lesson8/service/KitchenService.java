package com.belhard.lesson8.service;

import com.belhard.lesson8.base.Animal;

public interface KitchenService {

    void feed(Animal animal);

    void cook(String name, int amount);
}
