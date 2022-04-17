package com.belhard.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Расчет начисления процентов по кредиту");

        Scanner in = new Scanner(System.in);
        System.out.print("На какую сумму произвести расчет: ");
        float money = in.nextInt();

        System.out.print("За сколько месяцев: ");
        float mounth = in.nextInt();

        for(int i = 1; i <= mounth; i++) {
            money = money + money * 0.07f;
        }
        System.out.println("Итого к получению: " +money);
    }
}
