package com.company.service;

import com.company.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List<Teacher> teachers = new ArrayList<>();

    public void removeTeachers(List<Teacher> removeTeachers) {
        teachers.removeAll(removeTeachers);
    }

    public void addGroups(List<Teacher> newTeachers) {
        teachers.addAll(newTeachers);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
