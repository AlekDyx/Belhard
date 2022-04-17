package com.belhard.lesson5;

public class Animal {

    private String name;
    private int age;
   private double weight;

    public Animal (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
