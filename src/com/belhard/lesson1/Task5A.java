package com.belhard.lesson1;

import java.util.Scanner;

public class Task5A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как ваше имя?");
        String name = in.nextLine();
        System.out.println("И фамилия?");
        String surname = in.nextLine();
        System.out.println("Привет, " + name + " " + surname + "!");
    }
}
