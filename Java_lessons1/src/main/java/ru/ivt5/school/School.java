package ru.ivt5.School;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class School {
    private String name;
    private int year;
    private final Set<Group> groups;


    public School(String name, int year) throws TrainingException {
        validateName(name);
        this.name = name;
        this.year = year;
        this.groups = new HashSet<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws TrainingException {
        validateName(name);
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Set<Group> getGroups() {
        return new HashSet<>(groups);
    }

    public void addGroup(Group group) throws TrainingException {
        if (group == null) {
            throw new TrainingException(TrainingErrorCode.GROUP_NULL);
        }
        if (!groups.add(group)) {
            throw new TrainingException(TrainingErrorCode.DUPLICATE_GROUP_NAME);
        }
    }

    public void removeGroup(Group group) throws TrainingException {
        if (group == null || !groups.remove(group)) {
            throw new TrainingException(TrainingErrorCode.GROUP_NOT_FOUND);
        }
    }

    public void removeGroup(String groupName) throws TrainingException {
        Group group = findGroupByName(groupName);
        groups.remove(group);
    }

    public boolean containsGroup(Group group) {
        return groups.contains(group);
    }


    private void validateName(String name) throws TrainingException {
        if (name == null || name.isEmpty()) {
            throw new TrainingException(TrainingErrorCode.SCHOOL_WRONG_NAME);
        }
    }

    private Group findGroupByName(String groupName) throws TrainingException {
        return groups.stream()
                .filter(group -> group.getName().equals(groupName))
                .findFirst()
                .orElseThrow(() -> new TrainingException(TrainingErrorCode.GROUP_NOT_FOUND));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return year == school.year && Objects.equals(name, school.name) && Objects.equals(groups, school.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, groups);
    }
}