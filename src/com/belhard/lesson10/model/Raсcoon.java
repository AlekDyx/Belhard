package com.belhard.lesson10.model;

import java.util.SplittableRandom;

public class Raсcoon {
    private String name;
    private int age;
    private String color;

    public Raсcoon(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void displayInfo() {
        System.out.println(getName() + " " + getAge() + " " + getColor());
    }
}
