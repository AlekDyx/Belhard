package com.belhard.lesson5;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int summ = 0;
        for (int i : nums) {
            summ = summ + i++;
        }
        System.out.println(summ);

        Animal[] animals = new Animal[3];
        Animal animal1 = new Animal("Лев", 3, 93);
        Animal animal2 = new Animal("Жираф", 5, 302);
        Animal animal3 = new Animal("Попугай", 2, 1.5);
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        double summweight = 0;
        for (Animal i : animals) {
            summweight = summweight + i.getWeight();
        }
        System.out.println(summweight);
    }
}
