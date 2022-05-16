package com.company.model;

import com.company.base.People;

public class Teacher extends People {

    private int workHour = 140;
    private int workRate = 10;

    public Teacher(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public int displayPay() {
        int salary = workHour * workRate;
        System.out.println(salary);
        return salary;
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


