package com.example.demo.controller;


import com.example.demo.entity.Book;
import com.example.demo.entity.Library;
import com.example.demo.service.LibraryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/insert")
    public Library insertLib(@RequestBody Library library){
        return  libraryService.insertLibrary(library);
    }

    @GetMapping("/Library/{id}")
    public Library getLibraryById(@PathVariable int id){

        Book book = restTemplate.getForObject("http://localhost:9093/book/Book/"+id, Book.class);

        Library library = libraryService.getLibraryById(id);
        library.setBook(book);

        return library;
    }
}
