package com.company;

import java.util.ArrayList;

public class Group {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;


    public Group(String name, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    Group group = new Group("38 курс", teacher, students);

//    public void displayInfo() {
//        System.out.println(students.forEach(System.out::println));
//            }

    public String getName() {
        return name;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void changeTeacher(Teacher newTeacher) {
        teacher = newTeacher;
    }
}
