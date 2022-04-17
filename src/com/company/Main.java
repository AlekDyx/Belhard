package com.company;

public class Main {

    public static void main(String[] args) {

        Address[] addresses = new Address[3];
        Address address1 = new Address("Минск", "Пушкина", 30, 5);
        Address address2 = new Address("Минск", "Победителей", 10, 5);
        Address address3 = new Address("Минск", "Машерова", 11, 30);
        addresses[0] = address1;
        addresses[1] = address2;
        addresses[2] = address3;

        Student[] students = new Student[3];
        Student student1 = new Student("Студент", "Первый", 28, address1);
        Student student2 = new Student("Студент-Муж", "2.5", 30, address2);
        Student student3 = new Student("Студентка-Жена", "2.5", 30, address2);
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Teacher[] teachers = new Teacher[1];
        Teacher teacher1 = new Teacher("Учитель", "Первый", 198, address3);
        teachers[0] = teacher1;

        Group[] groups = new Group[1];
        Group group = new Group("38", "Курс", students[0], teachers[0]);
        groups[0] = group;
        group.displayInfo();

        teacher1.displayPay();
        teacher1.displayInfo();
        student1.displayInfo();
        group.displayInfo();

    }
}
