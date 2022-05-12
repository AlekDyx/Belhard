package com.company.model;

import com.company.base.People;

public class Student extends People {

    public Student(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public String toString() {
        return name + " " +soname+ ", " + age + " лет, " + address.displayInfo();
    }

}
