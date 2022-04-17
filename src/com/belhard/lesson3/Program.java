package com.belhard.lesson3;

public class Program {
    public static void main(String[] args) {
        Person AD = new Person("Алекс", "Снежок", 35, 85);
        AD.displayInfo();
        AD.changeColor("Желтуха");
        AD.displayInfo();

        Person MD = new Person("Мира", "Темный", 6, 22);
        MD.displayInfo();
    }
}

