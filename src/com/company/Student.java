package com.company;

import java.util.ArrayList;

import static com.company.PeopleList.student1;
import static com.company.PeopleList.student2;

public class Student extends People {

    public Student(String name, String soname, int age, Address address) {
        super(name, soname, age, address);
    }

    public static ArrayList<Student> students = new ArrayList<>(); {
        students.add(student1);
        students.add(student2);

        students.forEach(m -> {
            System.out.println(m);
        });
    }


    public String toString() {
        return name + " " +soname+ ", " + age + " лет, " + address.displayInfo();
    }

}
