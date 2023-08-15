package com.ilyakorob.robotyka.models;

public class School {
    private long id;
    private String name;
    private String address;
    private String group;

    public School(){

    }

    public School(String name, String address, String group) {
        this.name = name;
        this.address = address;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
