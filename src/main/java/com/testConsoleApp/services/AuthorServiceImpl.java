package com.testConsoleApp.services;

import com.testConsoleApp.entities.Author;
import com.testConsoleApp.entities.Book;
import com.testConsoleApp.interfaces.AuthorService;
import com.testConsoleApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void addBooksInAuthor(Author author, List<Book> books) {
        books.forEach(b -> b.setAuthor(author));
        author.getBooks().addAll(books);
        authorRepository.save(author);
    }

    @Override
    public List<Author> getAll() {
        List<Author> authors = authorRepository.findAll();
        return authors;
    }
}
