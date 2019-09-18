package com.testConsoleApp.repository;

import com.testConsoleApp.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query("select t from Teacher t")
    Stream<Teacher> getStream();
}
