package com.company.people;

import com.company.address.Address;

public class Teacher extends People {

    int workHour = 154;
    int workRate = 8;

    public Teacher(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public void displayInfo() {
        System.out.println(name + " " + soname + ", " + age + " лет, " + address.displayInfo());
    }

    public void displayPay() {
        int workHour = 140;
        int workRate = 10;
        System.out.println(workHour * workRate);
    }

    void workHourChange(Integer newworkHour) {
        workHour = newworkHour;
        System.out.println(workHour * workRate);
    }

    void workRateChange(Integer newworkRate) {
        workRate = newworkRate;
        System.out.println(workHour * workRate);
    }
}


