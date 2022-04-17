package com.belhard.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        double x1 = 36;
        double x2 = 10;
        double x3 = 1;
        System.out.println(x1 * x1 * 4 * 0.58);
        System.out.println(x2 * x2 * 4 * 0.58);
        System.out.println(x3 * x3 * 4 * 0.58);
        double x4 = 13;
        double x5 = 16;
        double x6 = 2;
        System.out.println(x4 * x4 * x4 * 0.5 + 3.0 * x4++);
        System.out.println(x5 * x5 * x5 * 0.5 + 3.0 * x5++);
        System.out.println(x6 * x6 * x6 * 0.5 + 3.0 * x6++);
        double x7 = 13;
        double x8 = 16;
        double x9 = 2;
        System.out.println(x7 * x7 * x7 * 0.5 + 3.0 * ++x7);
        System.out.println(x8 * x8 * x8 * 0.5 + 3.0 * ++x8);
        System.out.println(x9 * x9 * x9 * 0.5 + 3.0 * ++x9);
        int x = -3;
        if (x <= 10 && x != 5) {
            System.out.println(x);
        }
        else {
            System.out.println("Число не подходит");
        }
    }
}