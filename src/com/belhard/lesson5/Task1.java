package com.belhard.lesson5;

public class Task1 {

    public static void main(String[] args) {


        double[] nums = new double[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 100 * Math.random();
        }

        double max = nums[0]; // Массив не должен быть пустым
        double min = nums[0];
        double mid = 0;
        for (double v : nums) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;
            mid += v / nums.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mid = " + mid);
    }
}
