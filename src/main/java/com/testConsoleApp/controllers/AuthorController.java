package com.testConsoleApp.controllers;

import com.testConsoleApp.entities.Author;
import com.testConsoleApp.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping(value = "/authors", produces = "application/json")
    public List<Author> get(){
        return authorService.getAll();
    }
}
