package com.company;

import com.company.model.Address;
import com.company.model.Group;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.repository.GroupRepository;
import com.company.service.GroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);

        Address address1 = new Address("Минск", "Пушкина", 30, 5);
        Address address2 = new Address("Минск", "Победителей", 10, 5);
        Address address3 = new Address("Минск", "Машерова", 11, 30);
        Student student1 = new Student("Студент", "Первый", 28, address1);
        Student student2 = new Student("Студент", "Второй", 30, address2);
        Teacher teacher = new Teacher("Учитель", "Первый", 198, address3);

        ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);


        Group group = new Group("38", teacher, students);
        List<Group> groups = new ArrayList<>();
        groups.add(group);
        groupService.addGroups(groups);

    }
}