package com.belhard.lesson8;

import com.belhard.lesson8.base.Animal;
import com.belhard.lesson8.service.KitchenService;
import com.belhard.lesson8.service.KitchenServiceImpl;
import com.belhard.lesson8.zoo.Cat;
import com.belhard.lesson8.zoo.Crocodile;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile();
        Cat cat = new Cat("Порода", 3, "Кличка");

        KitchenService kitchenService = new KitchenServiceImpl();
        kitchenService.feed(cat);
        kitchenService.feed(crocodile);
        kitchenService.cook("Мурзика", 580);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(crocodile);

        ArrayList<Integer> massInt = new ArrayList<>();
        massInt.add(10);
        massInt.add(15);
        massInt.add(0,13);
        massInt.add(22);

        massInt.forEach(System.out::println);

    }
}
