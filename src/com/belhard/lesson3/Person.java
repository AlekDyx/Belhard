package com.belhard.lesson3;

class Person {
    String name;
    String color;
    int age;
    int weight;


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void displayInfo() {
        System.out.println("Имя: " + name + "; Цвет кожи: " + color + "; Возраст: " + age + "; Вес: " + weight);
    }

    void changeWeight(Integer newWeight) {
        weight = newWeight;
    }

    void changeAge(Integer newAge) {
        age = newAge;
    }

    void changeColor(String newColor) {
        color = newColor;
    }
}
