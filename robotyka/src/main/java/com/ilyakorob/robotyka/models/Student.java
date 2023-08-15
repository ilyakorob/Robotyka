package com.ilyakorob.robotyka.models;

public class Student {
    private long id;
    private String name;
    private String surname;
    private School school;
    private String group;

    public Student(){

    }

    public Student(String name, String surname, School school, String group) {
        this.name = name;
        this.surname = surname;
        this.school = school;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", school=" + school +
                ", group='" + group + '\'' +
                '}';
    }
}
