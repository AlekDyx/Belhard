package com.belhard.lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Расчет начисления процентов по кредиту");

        Scanner in = new Scanner(System.in);
        System.out.print("На какую сумму произвести расчет: ");
        float money = in.nextFloat();
        while (money <= 0) {
            System.out.print("Введенные данные не коректны, введите еще раз: ");
            money = in.nextFloat();
        }

        System.out.print("За сколько месяцев: ");
        int mounth = in.nextInt();
        int i = 1;

        while (i <= mounth) {
            money = money + money * 0.07f;
            i++;
        }

        System.out.println("Итого к получению: " + money);
    }
}
