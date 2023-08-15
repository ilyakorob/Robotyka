package com.ilyakorob.robotyka.models;

public class Teacher {
    private long id;
    private String name;
    private String surname;

    public Teacher() {

    }

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                '}';
    }
}