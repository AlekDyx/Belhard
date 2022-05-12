package com.company.service;

import com.company.model.Group;
import com.company.repository.GroupRepository;

import java.util.List;

public class GroupService {

    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void removeGroups(List<Group> removeGroups) {
        System.out.println("Remove Groups:");
        removeGroups.forEach(gr -> System.out.println(gr));
        groupRepository.removeGroups(removeGroups);
    }

    public void addGroups(List<Group> newGroups) {
        System.out.println("Add Groups:");
        newGroups.forEach(gr -> System.out.println(gr));
        groupRepository.addGroups(newGroups);
    }

    //добавить метод изменения имени группы
}
