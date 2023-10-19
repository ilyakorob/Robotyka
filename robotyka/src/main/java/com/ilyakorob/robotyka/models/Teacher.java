package com.ilyakorob.robotyka.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "Teacher")
public class Teacher {

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

    @OneToMany(mappedBy = "teacher")
    @JoinColumn(name = "teacher_id")
    private List<Student> students;

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
