package com.company;

public class Group {
    private String name;
    private String grade;
    private Student student;
    private Teacher teacher;

    public Group(String name, String grade, Student student, Teacher teacher) {
        this.name = name;
        this.grade = grade;
        this.student = student;
        this.teacher = teacher;
    }

    public void displayInfo() {
        System.out.println(name + " " + grade + ", " + student.toString() + " лет, " + teacher.toString());
            }

    public void setStudents(Student students) {
        this.student = students;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void changeTeacher(Teacher newTeacher) {
        teacher = newTeacher;
    }
    void changeStudent(Student newStudent) {
        student = newStudent;
    }
}
