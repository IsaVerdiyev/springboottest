package com.testConsoleApp;

import com.testConsoleApp.entities.Author;
import com.testConsoleApp.entities.Book;
import com.testConsoleApp.entities.Student;
import com.testConsoleApp.entities.Teacher;
import com.testConsoleApp.interfaces.AuthorService;
import com.testConsoleApp.interfaces.MessageRenderer;
import com.testConsoleApp.repository.AuthorRepository;
import com.testConsoleApp.repository.BookRepository;
import com.testConsoleApp.repository.TeacherRepository;
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

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    AuthorService authorService;

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

        authorService.addBooksInAuthor(author, new ArrayList<Book>(){
            {add(book);}
        });

        authorRepository.save(author);


        Teacher teacher = new Teacher();
        teacher.setFirstName("Qleb");
        teacher.setLastName("Skripnikov");
        Student student = new Student();
        student.setFirstName("Isa");
        student.setLastName("Verdiyev");

        teacherRepository.save(teacher);
    }
}
