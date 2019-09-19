package com.testConsoleApp.interfaces;

import com.testConsoleApp.entities.Author;
import com.testConsoleApp.entities.Book;

import java.util.List;

public interface AuthorService {
    Author addAuthor(Author author);
    void addBooksInAuthor(Author author, List<Book> books);
    List<Author> getAll();
}
