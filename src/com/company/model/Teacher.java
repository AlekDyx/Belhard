package com.company.model;

import com.company.base.People;

public class Teacher extends People {

    private int workHour;
    private int workRate;

    public Teacher(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public String toString() {
        return name + " " + soname + ", " + age + " лет, " + address.displayInfo();
    }

    public int displayPay() {
        workHour = 140;
        workRate = 10;
        int rez = workHour * workRate;
        System.out.println(rez);
        return rez;
    }

    public void setWorkHour(int workHour) {
        if(workHour > 0) {
            this.workHour = workHour;
        }
    }

    public void setWorkRate(int workRate) {
        if (workRate > 0) {
            this.workRate = workRate;
        }
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


