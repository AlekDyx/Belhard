package com.belhard.lesson7;

public class Main {

    public static void main(String[] args) {
        String str = "Hello World";
        String newStr = str + ", Nik";

        String[] mass = newStr.split(" ");
        for (String s : mass) {
            System.out.println(s);
        }

        String[] massName = {"Nik", "Misha", "Mary"};
        String rezalt = String.join(", ", massName);
        System.out.println(rezalt);

        String[] massTask = {"I", "Java", "study"};
        String temp = massTask[2];
        massTask[2] = massTask[1];
        massTask[1] = temp;

        String rez1 = mass1(massTask);
        System.out.println(rez1);

        String rez2 = mass2(massTask);
        System.out.println(rez2);

        String rez3 = mass3(massTask);
        System.out.println(rez3);

        String sss = "Nik98";

        char[] massChar = new char[2];
        sss.getChars(3, 5, massChar, 0);

        System.out.println(new String(massChar));


    }

    public static String mass1(String[] massTask) {
        return massTask[0].concat(" ".concat(massTask[1].concat(" ".concat(massTask[2]))));
    }

    public static String mass2(String[] massTask) {
        return String.join(" ", massTask);
    }

    public static String mass3(String[] massTask) {
        return massTask[0] + " " + massTask[1] + " " + massTask[2];
    }
}
