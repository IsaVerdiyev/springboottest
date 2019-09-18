package com.testConsoleApp;

import com.testConsoleApp.entities.Author;
import com.testConsoleApp.entities.Book;
import com.testConsoleApp.interfaces.MessageRenderer;
import com.testConsoleApp.repository.AuthorRepository;
import com.testConsoleApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    MessageRenderer messageRenderer;

    public Main(MessageRenderer messageRenderer) {
        this.messageRenderer = messageRenderer;
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Author author = new Author();
        author.setName("Name");
        author.setSurname("Surname");
        Book book = new Book();
        book.setName("Book 1");
        book.setAuthor(author);
        author.getBooks().add(book);

        authorRepository.save(author);
    }
}
