package com.belhard.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Здравствуйте, давайте посчитаем естественный прирост населения в стране XYZ");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите изначальное колличество населения: ");
        int pop = in.nextInt();

        System.out.print("Введите размер ествественной рождаемости(1к1000): ");
        int born = in.nextInt();

        System.out.print("Введите размер ествественной смертности(1к1000): ");
        int death = in.nextInt();

        System.out.print("Введите за какой период произвести расчет: ");
        int years = in.nextInt();

        int rost = born-death;

        for(int i = 1; i <= years; i++) {
            pop = pop + pop * rost / 1000;
        }
             System.out.println(pop);
    }
}
