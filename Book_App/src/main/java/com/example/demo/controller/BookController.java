package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/book")
public class BookController {


     @Autowired
     private BookService bookService;

       @GetMapping("/Book/{id}")
       public Book getBookById(@PathVariable int id){
            return  bookService.getBookById(id);

        }

    @PostMapping("/insert")
    public Book insertBook(@RequestBody Book book){
        return  bookService.insertBook(book);

    }
}
