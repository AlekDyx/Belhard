package com.company;

public class Teacher extends People {

    int workHour = 154;
    int workRate = 8;

    public Teacher(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public void displayInfo() {
        System.out.println(name + " " +soname+ ", " + age + " лет, " + address.displayInfo());
    }

    public void displayPay() {
        int workHour = 140;
        int workRate = 10;
        System.out.println(workHour * workRate);
        }

        void changeWorkHour(Integer newWorkHour) {
        workHour = newWorkHour;
        }
}
