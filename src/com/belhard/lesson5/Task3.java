package com.belhard.lesson5;

public class Task3 {

    public static void main(String[] args) {
        int num;
        for (num = 3; num <= 120; num++) {
            boolean easy = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    easy = true;
                    break;
                }
            }
            if (easy) {
                System.out.print(num + ", ");
            }
        }
    }
}


