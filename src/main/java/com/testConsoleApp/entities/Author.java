package com.testConsoleApp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;
    private String surname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Book> books = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
