package com.company.people;

import com.company.address.Address;

import java.util.ArrayList;

public class Student extends People {

    public Student(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    ArrayList<Student> studentList = new ArrayList<>();
    studentList.add

    public void displayInfo() {
        System.out.println(name + " " +soname+ ", " + age + " лет, " + address.displayInfo());
    }

}
