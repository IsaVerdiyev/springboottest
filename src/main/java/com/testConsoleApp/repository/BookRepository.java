package com.testConsoleApp.repository;

import com.testConsoleApp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
