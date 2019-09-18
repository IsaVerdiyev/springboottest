package com.testConsoleApp.repository;

import com.testConsoleApp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s from Student s")
    Stream<Student> getStream();
}
