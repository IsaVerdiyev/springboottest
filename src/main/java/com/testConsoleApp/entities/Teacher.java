package com.testConsoleApp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "teachers")
    private List<Student> students = new ArrayList<>();
}
