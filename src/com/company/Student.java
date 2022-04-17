package com.company;

public class Student extends People {

    public Student(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public void displayInfo() {
        System.out.println(name + " " +soname+ ", " + age + " лет, " + address.displayInfo());
    }

}
