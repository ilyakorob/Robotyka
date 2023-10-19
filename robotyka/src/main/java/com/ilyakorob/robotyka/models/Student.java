package com.ilyakorob.robotyka.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "Pole nie może być puste ")
    @Size(min = 2, max = 100, message = "Imie musi mieć od 2 do 100 znaków")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "Pole nie może być puste ")
    @Size(min = 2, max = 100, message = "Nazwisko musi mieć od 2 do 100 znaków")
    @Column(name = "surname")
    private String surname;

    @NotEmpty(message = "Pole nie może być puste ")
    @Size(min = 2, max = 100, message = "Nazwa grupy musi mieć od 2 do 100 znaków")
    @Column(name = "group")
    private String group;

    @ManyToOne
    @JoinColumn(name = "teacher_id",referencedColumnName = "id")
    private Teacher teacher;

    public Student(){

    }

    public Student(String name, String surname,  String group) {
        this.name = name;
        this.surname = surname;
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
                ", group='" + group + '\'' +
                '}';
    }
}
