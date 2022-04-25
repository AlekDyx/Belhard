package com.company;

public class Teacher extends People {

    int workHour = 154;
    int workRate = 8;

    public Teacher(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public String toString() {
        return name + " " + soname + ", " + age + " лет, " + address.displayInfo();
    }

    public void displayPay() {
        int workHour = 140;
        int workRate = 10;
        System.out.println(workHour * workRate);
    }

    void workHourChange(Integer newWorkHour) {
        workHour = newWorkHour;
        System.out.println(workHour * workRate);
    }

    void workRateChange(Integer newWorkRate) {
        workRate = newWorkRate;
        System.out.println(workHour * workRate);
    }
}


