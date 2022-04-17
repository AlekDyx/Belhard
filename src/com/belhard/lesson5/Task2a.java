package com.belhard.lesson5;

public class Task2a {

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 4, 2, 8, 1, 5};
        for (int i = 1; i < array1.length; i++) {
            int num = array1[i];
            int j = i;
            while (j > 0 && array1[j - 1] > num) {
                array1[j] = array1[j - 1];
                j--;
            }
            array1[j] = num;
        }

        for (int i : array1) {
            System.out.print(i + " ");
        }
    }
}

