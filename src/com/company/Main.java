package com.company;

import static com.company.PeopleList.*;
import static com.company.Student.students;

public class Main {

    public static void main(String[] args) {

        student1.displayInfo();

        Group group = new Group("38 курс", teacher, students);
        group.toString();

        teacher.displayPay();

    }
}