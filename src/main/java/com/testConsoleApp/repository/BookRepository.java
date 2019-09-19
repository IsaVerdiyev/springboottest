package com.testConsoleApp.repository;

import com.testConsoleApp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("select b from Book b")
    Stream<Book> getStream();
}
